package com.letsparty.service.dao;

import com.letsparty.service.LetsPartyHibernateUtil;
import com.letsparty.service.bean.PartnerBean;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class PartnerDao implements IBeanDao<PartnerBean> {

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

	@Override
	public void saveBean(PartnerBean partnerBean) {

	}

	@Override
	public PartnerBean getBean(long id) {
		Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "FROM PartnerBean WHERE PartnerBean.id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<PartnerBean> result = query.list();
		session.getTransaction().commit();
		session.close();
		if ((null != result) && (0 != result.size())) {
			return result.get(0);
		}

		return null;
	}

	@Override
	public void updateBean(PartnerBean partnerBean) {

	}

	@Override
	public List<PartnerBean> getAllBean() {
		return null;
	}
}
