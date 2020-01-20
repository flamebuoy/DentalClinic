

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spr.dto.Appointment;

public class AppointmentDaoImple implements AppointmentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
}

	@Override
	public void makeappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback<List<Appointment>>() {
			@Override
			public List<Appointment> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(appointment);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void showappointment(int appointmentId) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback<List<Appointment>>() {
			@Override
			public List<Appointment> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.show(new Appointment(appointmentID));
				t.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Appointment selectById(int appointmentId) {
		// TODO Auto-generated method stub
		Appointment a = hibernateTemplate.execute(new HibernateCallback<Appointment>() {
			@Override
			public Appointment doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Appointment apt = (Appointment)session.get(Appointment.class, appointmentId);
				t.commit();
				session.flush();
				session.close();
				return apt;
			}
			
		});

		return a;
		
	}

	@Override
	public List<Appointment> selectAll() {
		// TODO Auto-generated method stub
		List<Appointment> li = hibernateTemplate.execute(new HibernateCallback<List<Appointment>>() {
			@Override
			public List<Appointment> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Appointment");
				List<Appointment> li = q.list();
				t.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});

		return li;
	}
