package com.letsparty.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LetsPartyHibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSession();

	private static SessionFactory buildSession(){
		
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory() ;
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void shutDown(){
		getSessionFactory().close();
	}

}
