package com.dist.dao;

import java.util.List;

import com.dist.dto.Appointment;

public interface AppointmentDao {

	public void makeappointment(Appointment appointment);
	public void updateappointment(Appointment appointment);
	public void deleteappointment(int appointmentId);
	Appointment selectById(int appointmentId);
	List<Appointment> selectAll();
	
}
