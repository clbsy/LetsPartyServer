package com.letsparty.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partner") 
public class PartnerBean {
	
	
	private int id;
	private String name;
	private String nickName;
	
	public void setId(int id){
		this.id = id;
	}
	@Id
	@GeneratedValue
	public int getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	
	public void setNickName(String nickName){
		this.nickName = name;
	}
	
	public String getNickName(){
		return this.nickName;
	}
}
