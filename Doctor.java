package com.spr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@Column(name = "doctor_id")
	private int DoctorId;
	@Column(name = "doctor_Name")
	private String DoctorName;
	
	public Doctor(int DoctorId) {
		super();
		this.DoctorId = DoctorId;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String DoctorAge;
	private String DoctorGender;
	private String DoctorQualification;
	private String DoctorVisitingTime;
	private String Treatment;
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getDoctorAge() {
		return DoctorAge;
	}
	public void setDoctorAge(String doctorAge) {
		DoctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return DoctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		DoctorGender = doctorGender;
	}
	public String getDoctorQualification() {
		return DoctorQualification;
	}
	public void setDoctorQualification(String doctorQualification) {
		DoctorQualification = doctorQualification;
	}
	public String getDoctorVisitingTime() {
		return DoctorVisitingTime;
	}
	public void setDoctorVisitingTime(String doctorVisitingTime) {
		DoctorVisitingTime = doctorVisitingTime;
	}
	public String getTreatment() {
		return Treatment;
	}
	public void setTreatment(String treatment) {
		Treatment = treatment;
	}
	
	
	
	
}
