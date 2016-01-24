package com.letsparty.service.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.letsparty.service.dao.SubjectDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.letsparty.service.bean.Greeting;
import com.letsparty.service.dao.PartnerDao;

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
	public Object getParties(){
		return mSubjectDao.getAllBean();
	}
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
