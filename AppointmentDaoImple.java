package com.dist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dist.dto.Appointment;
import com.dist.dto.AppointmentRowMapper;

@Transactional
@Repository
public class AppointmentDaoImple implements AppointmentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void makeappointment(Appointment appointment) {
		String query = "INSERT INTO appointment(appointment_id, patient_id, doctor_name, aptt_purpose, DOA, Aptt_time) VALUES(?,?,?,?,?)";
		jdbcTemplate.update(query, appointment.getAppointmentId(), appointment.getPatientId(), appointment.getDoctorName(), appointment.getAppointmentPurpose(), appointment.getDateOfAppointment(), appointment.getAppointmentTime());
		
		
	}

	
	public void updateappointment(Appointment appointment) {
		// TODO Auto-generated method stub
		String query = "UPDATE appointment SET patient_id=?, doctor_name=?, aptt_purpose=?, DOA=?, Aptt_time=? WHERE appointmentId=?";
		jdbcTemplate.update(query, appointment.getPatientId(), appointment.getDoctorName(), appointment.getAppointmentPurpose(), appointment.getDateOfAppointment(), appointment.getAppointmentTime(), appointment.getAppointmentId());
		
	}

	
	public void deleteappointment(int appointmentId) {
		// TODO Auto-generated method stub
		String query = "DELETE FROM appointment WHERE appointment_id=?";
		jdbcTemplate.update(query, appointmentId);
		
	}

	
	public Appointment selectById(int appointmentId) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM appointment WHERE appointment_id = ?";
		RowMapper<Appointment> rowMapper = new BeanPropertyRowMapper<Appointment>(Appointment.class);
		Appointment appointment = jdbcTemplate.queryForObject(query, rowMapper, appointmentId);
		
		return appointment;
		
	}

	
	public List<Appointment> selectAll() {
		// TODO Auto-generated method stub
		String query = "SELECT * from appointment";
		RowMapper<Appointment> rowMapper = new AppointmentRowMapper();
		List<Appointment> list = jdbcTemplate.query(query, rowMapper);
		
		
		return list;
	}

}
