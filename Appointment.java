package com.dist.dto;

public class Appointment {

	private int AppointmentId;
	private int PatientId;
	private String DoctorName;
	private String AppointmentPurpose;
	private String DateOfAppointment;
	private String AppointmentTime;
	
	@Override
	public String toString() {
		return "Appointment [AppointmentId=" + AppointmentId + ", PatientId=" + PatientId + ", DoctorName=" + DoctorName + ", AppointmentPurpose="
				+ AppointmentPurpose + ", DateOfAppointment=" + DateOfAppointment + ", AppointmentTime="
				+ AppointmentTime + "]";
	}
	public Appointment(int appointmentId, int patientId, String doctorName, String appointmentPurpose, String dateOfAppointment,
			String appointmentTime) {
		super();
		AppointmentId = appointmentId;
		PatientId = patientId;
		DoctorName = doctorName;
		AppointmentPurpose = appointmentPurpose;
		DateOfAppointment = dateOfAppointment;
		AppointmentTime = appointmentTime;
	}
	public int getAppointmentId() {
		return AppointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		AppointmentId = appointmentId;
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getAppointmentPurpose() {
		return AppointmentPurpose;
	}
	public void setAppointmentPurpose(String appointmentPurpose) {
		AppointmentPurpose = appointmentPurpose;
	}
	public String getDateOfAppointment() {
		return DateOfAppointment;
	}
	public void setDateOfAppointment(String dateOfAppointment) {
		DateOfAppointment = dateOfAppointment;
	}
	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		AppointmentTime = appointmentTime;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
