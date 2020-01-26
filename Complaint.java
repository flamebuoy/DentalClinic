package com.dist.dto;

public class Complaint {

	private int ComplaintId;
	private int PatientId;
	private String ChiefComplaint;
	private String MedicalHistory;
	private String Habits;
	private String Alergies;
	
	public Complaint(int complaintId, int patientId, String chiefComplaint, String medicalHistory, String habits, String alergies) {
		super();
		ComplaintId = complaintId;
		PatientId = patientId;
		ChiefComplaint = chiefComplaint;
		MedicalHistory = medicalHistory;
		Habits = habits;
		Alergies = alergies;
	}

	@Override
	public String toString() {
		return "Complaint [ComplaintId=" + ComplaintId + ",PatientId=" + PatientId + ", ChiefComplaint=" + ChiefComplaint + ", MedicalHistory="
				+ MedicalHistory + ", Habits=" + Habits + ", Alergies=" + Alergies + "]";
	}

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getComplaintId() {
		return ComplaintId;
	}

	public void setComplaintId(int complaintId) {
		ComplaintId = complaintId;
	}
	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getChiefComplaint() {
		return ChiefComplaint;
	}

	public void setChiefComplaint(String chiefComplaint) {
		ChiefComplaint = chiefComplaint;
	}

	public String getMedicalHistory() {
		return MedicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}

	public String getHabits() {
		return Habits;
	}

	public void setHabits(String habits) {
		Habits = habits;
	}

	public String getAlergies() {
		return Alergies;
	}

	public void setAlergies(String alergies) {
		Alergies = alergies;
	}

	
}
