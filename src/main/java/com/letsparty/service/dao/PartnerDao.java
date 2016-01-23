package com.letsparty.service.dao;

import java.util.List;

import org.hibernate.Session;

import com.letsparty.service.LetsPartyHibernateUtil;
import com.letsparty.service.bean.PartnerBean;

public class PartnerDao {

	public List<PartnerBean> getList(){
		
		Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
//		String hql="select * from partner";
//		List list= session.createSQLQuery(hql).list();
		session.beginTransaction();
		List<PartnerBean> result = session.createQuery("from PartnerBean").list();
        session.getTransaction().commit();
		session.close();
		return result;
	}
}
