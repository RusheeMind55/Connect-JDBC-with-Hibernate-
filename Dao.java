package com.Jbk.DeleteApi.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	@Autowired
	SessionFactory factory;
	
	public String add(Delete d) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
		session=factory.openSession();
		session.beginTransaction();
		
		session.persist(d);
		tx.commit();
		msg="Data are added";

		
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally{
			if(session!=null) {
				session.close();
			}
			
		}
		return msg;
		
	}

}
