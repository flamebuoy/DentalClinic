

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@Column(name = "appointment_id")
	private int appointmentId;
	@Column(name = "Appointment_reason")
	private String FirstName;
	
	public Appointment(int appointmentId) {
		super();
		this.appointmentId = appointmentId;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String AppointmentDate;
	private String AppointmentTime;
	
	public String getAppointmentDate() {
		return AppointmentDate;
	}
	public void setAppointmentDate(String appointmentdate) {
		AppointmentDate = appointmentdate;
	}
	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmenttime) {
		AppointmentTime = appointmenttime;
	}
	
}

