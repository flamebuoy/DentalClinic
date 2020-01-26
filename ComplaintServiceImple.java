package com.dist.service;

import java.util.List;

import com.dist.dao.ComplaintDaoImple;
import com.dist.dto.Complaint;

public class ComplaintServiceImple implements ComplaintService {

	private ComplaintDaoImple complaintDao;
	
	public void addcomplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		complaintDao.addcomplaint(complaint);
		
	}

	public void updatecomplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		complaintDao.updatecomplaint(complaint);
		
	}

	public void deletecomplaint(int complaintId) {
		// TODO Auto-generated method stub
		complaintDao.deletecomplaint(complaintId);
		
	}

	public Complaint selectById(int complaintId) {
		// TODO Auto-generated method stub
		return complaintDao.selectById(complaintId);
	}

	public List<Complaint> selectAll() {
		// TODO Auto-generated method stub
		return complaintDao.selectAll();
	}

}
