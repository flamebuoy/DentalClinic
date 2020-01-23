package com.spr.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.spr.dto.Disease;

@Repository
public class DiseaseDaoImple implements DiseaseDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void adddisease(Disease disease) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback<List<Disease>>() {
			@Override
			public List<Disease> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(disease);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void removedisease(int diseaseId) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback<List<Product>>() {
			@Override
			public List<Disease> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.delete(new Disease(diseaseId));
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Disease selectById(int diseaseId) {
		// TODO Auto-generated method stub
		Disease d = hibernateTemplate.execute(new HibernateCallback<Disease>() {
			@Override
			public Disease doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Disease ds = (Disease)session.get(Disease.class, diseaseId);
				t.commit();
				session.flush();
				session.close();
				return ds;
			}
			
		});

		return d;
	}

	@Override
	public List<Disease> selectAll() {
		// TODO Auto-generated method stub
		List<Disease> li = hibernateTemplate.execute(new HibernateCallback<List<Disease>>() {
			@Override
			public List<Disease> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Disease");
				List<Disease> li = q.list();
				t.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});

		return li;
	}

}
