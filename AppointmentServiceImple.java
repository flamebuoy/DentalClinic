package com.dist.service;

import java.util.List;

import com.dist.dao.AppointmentDaoImple;
import com.dist.dto.Appointment;

public class AppointmentServiceImple implements AppointmentService {
	
	private AppointmentDaoImple appointmentDao;
	
	public void makeappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDao.makeappointment(appointment);
		
	}

	public void updateappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDao.updateappointment(appointment);
		
	}

	public void deleteappointment(int appointmentId) {
		// TODO Auto-generated method stub
		appointmentDao.deleteappointment(appointmentId);
		
	}

	public Appointment selectById(int appointmentId) {
		// TODO Auto-generated method stub
		return appointmentDao.selectById(appointmentId);
	}

	public List<Appointment> selectAll() {
		// TODO Auto-generated method stub
		return appointmentDao.selectAll();
	}

}
