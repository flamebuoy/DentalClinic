package com.spr.serv;

import java.util.List;

import com.spr.dao.AppointmentDao;
import com.spr.dto.Appointment;

public class AppointmentServiceImple implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;
	
	public void setDoctorDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
		
	}
	
	@Override
	public void makeappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showappointment(int appointmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Appointment selectById(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
