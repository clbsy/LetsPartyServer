package com.letsparty.service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.letsparty.service.bean.Comment;
import com.letsparty.service.bean.Greeting;
import com.letsparty.service.dao.PartnerDao;
import com.letsparty.service.dao.SubjectDao;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PartnerController {
	private PartnerDao partnerDao = new PartnerDao();
	private SubjectDao mSubjectDao = new SubjectDao();
	@RequestMapping("/welcome")
	@ResponseBody 
	public Object getPartner(){
		System.out.println("spring mvc hello world!"); 
		/*PartnerBean partner = new PartnerBean();
		partner.setId(100);
		partner.setName("test");
		partner.setNickName("test   test");*/
		return partnerDao.getList();
	}

	@RequestMapping("/parties")
	@ResponseBody
	public Object getParties(@RequestParam(value="partnerId", defaultValue="-1") long partnerId){
		return mSubjectDao.getAllBean();
	}

	@RequestMapping("/save_comment")
	public String saveComment(@RequestParam(value="subjectId", defaultValue="-1") long subjectId, @RequestParam(value="comment", defaultValue="") String comment, @RequestParam(value="partnerId", defaultValue="-1") long partnerId) {
		if (0 > subjectId) {
			return "subjectId < 0";
		}

		if (0 > partnerId) {
			return "partnerId < 0";
		}

		if ((null == comment) || (comment.trim().length() == 0)) {
			return "comment is empty";
		}

		String comments = mSubjectDao.getComments(subjectId);
		JSONArray commentArray;
		if (null == comments) {
			commentArray = new JSONArray();
		} else {
			commentArray = new JSONArray(comments);
		}
		Comment newComment = new Comment(partnerId);
		newComment.setContent(comment);
		System.out.println("saveComment - newComment : " + newComment.getJson());
		if (commentArray.toString().contains(newComment.getJson().toString())) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("resultCode", 1);
			jsonObject.put("error", "Duplicate comment");
			return jsonObject.toString();
		}
		commentArray.put(newComment.getJson());
		int result = mSubjectDao.updateComments(subjectId, commentArray.toString());
		JSONObject jsonObject = new JSONObject();
		if (result > 0) {
			jsonObject.put("resultCode", 0);
			jsonObject.put("comments", commentArray);
		} else {
			jsonObject.put("resultCode", 1);
			jsonObject.put("error", "Update db error.");
		}
		return jsonObject.toString();
	}

	@RequestMapping("/update_fav")
	public String updateFav(@RequestParam(value="subjectId", defaultValue="-1") long subjectId) {
		if (0 > subjectId) {
			return "subjectId < 0";
		}

		long fav = mSubjectDao.getFav(subjectId);
		fav++;
		int result = mSubjectDao.updateFav(subjectId, fav);
		JSONObject jsonObject = new JSONObject();
		if (result > 0) {
			jsonObject.put("resultCode", 0);
			jsonObject.put("fav", fav);
		} else {
			jsonObject.put("resultCode", 1);
			jsonObject.put("error", "Update db error.");
		}
		return jsonObject.toString();
	}
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
