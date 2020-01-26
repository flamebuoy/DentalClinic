package com.dist.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ComplaintRowMapper implements RowMapper<Complaint> {

	public Complaint mapRow(ResultSet rs, int rowNum) throws SQLException {
		Complaint complaint = new Complaint();
		complaint.setComplaintId(rs.getInt("complaintId"));
		complaint.setPatientId(rs.getInt("patientId"));
		complaint.setChiefComplaint(rs.getString("chiefComplaint"));
		complaint.setMedicalHistory(rs.getString("medicalHistory"));
		complaint.setHabits(rs.getString("habits"));
		complaint.setAlergies(rs.getString("alergies"));
		return complaint;
	}

}
