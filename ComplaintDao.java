package com.dist.dao;

import java.util.List;

import com.dist.dto.Complaint;

public interface ComplaintDao {

	public void addcomplaint(Complaint complaint);
	public void updatecomplaint(Complaint complaint);
	public void deletecomplaint(int complaintId);
	Complaint selectById(int complaintId);
	List<Complaint> selectAll();
}
