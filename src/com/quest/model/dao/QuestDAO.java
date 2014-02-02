package com.quest.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.quest.model.dto.Quest;

public class QuestDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Long saveQuest(Quest questO)
    {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;
        Long cityId = null;
        try {
            transaction = session.beginTransaction(); 
            session.save(questO);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cityId;
    }
 
	public Long updateQuest(Quest questO)
    {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;
        Long cityId = null;
        try {
            transaction = session.beginTransaction(); 
            session.saveOrUpdate(questO);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cityId;
    }
	
	public Long updateQuestPerfect(Quest questO)
    {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;
        Quest questToUpdate = null;
        Long cityId = null;
        try {
	            transaction = session.beginTransaction(); 
	            if( 0 != questO.getId()){
		            	 questToUpdate = (Quest)session.load(Quest.class, questO.getId());                 
		                 questToUpdate.getQuestions().addAll(questO.getQuestions());            
	            }else{
		                 questToUpdate = questO;
	            }
	            session.saveOrUpdate(questToUpdate);
	            transaction.commit();
	            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cityId;
    }
	
    @SuppressWarnings("unchecked")
    public List<Quest> fetchListQuest()
    {
    	List<Quest> quests = null;
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;
        try {
	            transaction = session.beginTransaction();
	            quests = session.createQuery("from Quest").list(); 	            
	            transaction.commit();
	            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return quests;
    }
    
    @SuppressWarnings("unchecked")
    public List<Quest> fetchListQuestWithQuestion()
    {
    	List<Quest> quests = null;
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;
        try {
	            transaction = session.beginTransaction();
	            quests = session.createQuery("from Quest").list(); 	            
	            transaction.commit();
	            
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return quests;
    }
   
 
  
}
