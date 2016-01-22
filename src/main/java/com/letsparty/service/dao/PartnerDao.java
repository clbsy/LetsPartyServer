package com.letsparty.service.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.letsparty.service.LetsPartyHibernateUtil;
import com.letsparty.service.PartnerBean;

public class PartnerDao {

	public List<PartnerBean> getList(){
		
		Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hql="select * from partner";
		List list= session.createSQLQuery(hql).list();
		return list;
	}
}
