package com.quest.model.dao;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.quest.model.dto.Question;

public class QuestionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
    public Question  getQuestionDetails(Question question)
    {
		
        Session session = sessionFactory.getCurrentSession();
       // Transaction transaction = null;
        try {
	           // question = transaction.l Question            
        	question = (Question) session.get(Question.class, question.getId());
	           // transaction.commit();
	            System.out.println(question.getName());
        } catch (HibernateException e) {
           // transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return question;
    }
    
	@SuppressWarnings("unchecked")
    public Question  getCriteriaQuestionDetails(Question question)
    {		
        Session session = sessionFactory.getCurrentSession();
        
        try {
    
    		  Criteria criteria = session.createCriteria(Question.class);
    		  criteria.setFetchMode("quests", FetchMode.EAGER);    		
    		  question = (Question) criteria.list().get(0);
    		
           } catch (HibernateException e) {          
              e.printStackTrace();
           } finally {
            session.close();
           }
        return question;
    }

}
