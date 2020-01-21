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

import com.spr.dto.Product;

@Repository
public class DoctorDaoImple implements DoctorDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void add(Doctor doctor) {
		hibernateTemplate.execute(new HibernateCallback<List<Doctor>>() {
			@Override
			public List<Doctor> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(doctor);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public void remove(int doctorId) {
		hibernateTemplate.execute(new HibernateCallback<List<Doctor>>() {
			@Override
			public List<Doctor> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.delete(new Product(doctorId));
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void edit(Doctor doctor) {
		hibernateTemplate.execute(new HibernateCallback<List<Doctor>>() {
			@Override
			public List<Doctor> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.update(doctor);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

		
	}

	@Override
	public Doctor selectById(int doctorId) {
		Doctor d = hibernateTemplate.execute(new HibernateCallback<Doctor>() {
			@Override
			public Doctor doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Doctor doctor = (Doctor)session.get(Doctor.class, doctorId);
				t.commit();
				session.flush();
				session.close();
				return doctor;
			}
			
		});

		return d;
	}

	@Override
	public List<Doctor> selectAll() {
		List<Doctor> li = hibernateTemplate.execute(new HibernateCallback<List<Doctor>>() {
			@Override
			public List<Doctor> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Doctor");
				List<Doctor> li = q.list();
				t.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});

		return li;
	}

}

