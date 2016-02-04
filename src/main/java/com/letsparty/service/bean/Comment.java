package com.letsparty.service.bean;

import org.json.JSONObject;

/**
 * Created by xulin on 2016/2/4.
 */
public class Comment {
    long partnerId;
    String nickName;
    String name;
    String content;

    public Comment(long partnerId) {
        this.partnerId = partnerId;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public JSONObject getJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("partnerId", partnerId);
        if (null != content) {
            jsonObject.put("content", content);
        }

        if (null != name) {
            jsonObject.put("name", name);
        }

        if (null != nickName) {
            jsonObject.put("nickName", nickName);
        }
        return jsonObject;
    }
}
