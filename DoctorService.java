package com.spr.serv;

import java.util.List;

import com.spr.dto.Doctor;

public interface DoctorService {
	void add(Doctor doctor);
	void remove(int doctorId);
	void edit(Doctor doctor);
	Doctor selectById(int doctorId);
	List<Doctor> selectAll();
}

