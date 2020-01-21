package com.spr.serv;

import java.util.List;



import com.spr.dto.Appointment;


public interface AppointmentService {
	void makeappointment(Appointment appointment);
	void showappointment(int appointmentId);
	Appointment selectById(int appointmentId);
	List<Appointment> selectAll();
	
	

}