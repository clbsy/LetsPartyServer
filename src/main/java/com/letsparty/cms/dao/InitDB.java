package com.letsparty.cms.dao;

public class InitDB {
	
	String sql = "CREATE DATABASE letsparty IF NOT EXISTS;";
	String sql1 = "CREATE TABLE partner (id int not null auto_increment primary key ,name varchar(30) not null,nickname varchar(30),mail vchar(30),"
			+ "telephone number(11),qq number(13),interest vchar(100))";
	String sql2 = "CREATE TABLE organizer (id int not null auto_increment primary key,country,province,city,location,contacts,telephone,name,introduction,picture,subject);";
	String sql3 = "CREATE TABLE activity ()";
	String sql4 = "CREATE TABLE comment ()";
	String sql5 = "CREATE TABLE subject ()";
	/**
	 * CREATE DATABASE letsparty IF NOT EXISTS;
	 * CREATE TABLE partner (id int not null auto_increment primary key ,name varchar(30) not null,nickname varchar(30),mail vchar(30),telephone number(11),qq number(13),interest vchar(100));
	 * CREATE TABLE organizer (id int not null auto_increment primary key,country,province,city,location,contacts,telephone,name,introduction,picture,subject);
	 * CREATE TABLE activity (id int not null auto_increment primary key,subject_id int not null,organizer_id int,oragnizer_tel varchar(11),time ,activity_info varchar(100),picture varchar(256),partner_id int);
	 * CREATE TABLE comment (id int not null auto_increment primary key,activity_content varchar,picture varchar(256),commentor  int );
	 * CREATE TABLE subject (id int not null auto_increment primary key,subject varchar(100),classification varchar(100));
	 * 
	 */
}
