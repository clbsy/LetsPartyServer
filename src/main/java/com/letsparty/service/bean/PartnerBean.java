package com.letsparty.service.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public int getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Column(name = "name")
	public String getName(){
		return this.name;
	}
	
	public void setNickName(String nickName){
		this.nickName = name;
	}
	
	@Column(name = "nickname")
	public String getNickName(){
		return this.nickName;
	}
}
