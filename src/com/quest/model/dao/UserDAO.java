package com.quest.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quest.model.dto.User;
 
@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveUser(User user)
    {
		sessionFactory.getCurrentSession().save(user);
    }
 
    @SuppressWarnings("unchecked")
    public  List<User>  listUser()
    {
    	return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
    }
 
    public void updateUser(Long cityId, String cityName)
    {
        Session session = sessionFactory.getCurrentSession();;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User city = (User) session.get(User.class, cityId);
            city.setFirstname(cityName);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
 
    public void deleteUser(Long cityId)
    {
        Session session = sessionFactory.getCurrentSession();;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User city = (User) session.get(User.class, cityId);
            session.delete(city);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
