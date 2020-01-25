package com.dist.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AppointmentRowMapper implements RowMapper<Appointment> {

	public Appointment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(rs.getInt("appointmentId"));
		appointment.setPatientId(rs.getInt("patientId"));
		appointment.setDoctorName(rs.getString("doctorName"));
		appointment.setAppointmentPurpose(rs.getString("appointmentPurpose"));
		appointment.setDateOfAppointment(rs.getString("dateOfAppointment"));
		appointment.setAppointmentTime(rs.getString("appointmentTime"));
		return appointment;
	}

}
