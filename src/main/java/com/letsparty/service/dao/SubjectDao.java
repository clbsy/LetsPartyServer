package com.letsparty.service.dao;

import com.letsparty.service.LetsPartyHibernateUtil;
import com.letsparty.service.bean.PartyItem;
import org.hibernate.Session;

import java.util.List;

public class SubjectDao implements IBeanDao<PartyItem> {

    @Override
    public void saveBean(PartyItem partyItem) {

    }

    @Override
    public PartyItem getBean(long id) {
        return null;
    }

    @Override
    public void updateBean(PartyItem partyItem) {

    }

    @Override
    public  List<PartyItem> getAllBean() {
        Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
//		String hql="select * from partner";
//		List list= session.createSQLQuery(hql).list();
        session.beginTransaction();
        List<PartyItem> result = session.createQuery("from PartyItem").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }
}
