package com.letsparty.service.dao;

import com.letsparty.service.LetsPartyHibernateUtil;
import com.letsparty.service.bean.PartyItem;
import org.hibernate.Query;
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
        session.beginTransaction();
        List<PartyItem> result = session.createQuery("from PartyItem").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public int updateComments(long id, String comments) {
        System.out.println("updateComments - id : " + id + ", comments : " + comments);
        Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "UPDATE PartyItem PI set PI.comments = :comments "  +
                "WHERE PI.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("comments", comments);
        int result = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Rows affected: " + result);
        return result;
    }

    public String getComments(long id) {
        Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "SELECT PI.comments FROM PartyItem PI WHERE PI.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<String> result = query.list();
        session.getTransaction().commit();
        session.close();
        if ((null != result) && (0 < result.size())) {
            return result.get(0);
        }

        return null;
    }

    public long getFav(long id) {
        Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "SELECT PI.fav FROM PartyItem PI WHERE PI.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Long> result = query.list();
        session.getTransaction().commit();
        session.close();
        if ((null != result) && (0 < result.size())) {
            return result.get(0);
        }

        return 0;
    }

    public int updateFav(long id, long fav) {
        System.out.println("updateFav - id : " + id + ", fav : " + fav);
        Session session = LetsPartyHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "UPDATE PartyItem PI set PI.fav = :fav "  +
                "WHERE PI.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("fav", fav);
        int result = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Rows affected: " + result);
        return result;
    }
}
