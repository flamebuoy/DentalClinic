package com.spr.serv;

import java.util.List;

import com.spr.dto.Doctor;

public class DoctorServiceImple implements DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
		
	}
	
	@Override
	public void add(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor selectById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
