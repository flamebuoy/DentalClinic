package com.dist.service;

import java.util.List;

import com.dist.dto.Appointment;

public interface AppointmentService {

	public void makeappointment(Appointment appointment);
	public void updateappointment(Appointment appointment);
	public void deleteappointment(int appointmentId);
	Appointment selectById(int appointmentId);
	List<Appointment> selectAll();
}
