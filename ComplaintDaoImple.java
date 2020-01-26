package com.dist.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dist.dto.Complaint;
import com.dist.dto.ComplaintRowMapper;

@Transactional
@Repository
public class ComplaintDaoImple implements ComplaintDao{

	private JdbcTemplate jdbcTemplate;
	
	public void addcomplaint(Complaint complaint) {
		String query = "INSERT INTO complaint (complaintiD, patientId, c_complaint, med_history, habits, alergies) VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(query, complaint.getComplaintId(), complaint.getPatientId(), complaint.getChiefComplaint(), complaint.getMedicalHistory(), complaint.getHabits(), complaint.getAlergies());
		
	}

	public void updatecomplaint(Complaint complaint) {
		String query = "UPDATE complaint SET patientId=?, c_complaint=?, med_history=?, habits=?, alergies=? WHERE complaintId=?";
		jdbcTemplate.update(query, complaint.getPatientId(), complaint.getChiefComplaint(), complaint.getMedicalHistory(), complaint.getHabits(), complaint.getAlergies(), complaint.getComplaintId());
		
	}

	public void deletecomplaint(int complaintId) {
		String query = "DELETE FROM complaint WHERE complaintId=?";
		jdbcTemplate.update(query, complaintId);
		
	}

	public Complaint selectById(int complaintId) {
		String query = "SELECT * FROM complaint WHERE complaintId = ?";
		RowMapper<Complaint> rowMapper = new BeanPropertyRowMapper<Complaint>(Complaint.class);
		Complaint complaint = jdbcTemplate.queryForObject(query, rowMapper, complaintId);
		
		return complaint;
	}

	public List<Complaint> selectAll() {
		String query = "SELECT * from complaint";
		RowMapper<Complaint> rowMapper = new ComplaintRowMapper();
		List<Complaint> list = jdbcTemplate.query(query, rowMapper);
		
		
		return list;
	}

}
