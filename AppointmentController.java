

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.dto.Appointment;
import com.spr.serv.PatientServ;




public class AppointmentController {
	
	
	@Autowired
	private PatientServ patientServ;
	
	public void setPatientServ(PatientServ patientServ) {
		this.patientServ =patientServ;
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/patient_add_form")
	public String prepPatientAddform(ModelMap model) {
		model.put("patient", new Patient());
		return "patient_add_form";
	}
	
	@RequestMapping(value = "/patient_add")
	public String addPatient(Patient patient,ModelMap model) {
		patientServ.add(patient);
		model.put("patient", new Patient());
		return "patient_add_form";
	}
	
	@RequestMapping(value = "/patient_list")
	public String patientList(ModelMap model) {
		List<Patient> plist = patientServ.selectAll();
		model.put("patientList", plist);
		return "patient_list";
	}
	
	@RequestMapping(value = "/patient_delete")
	public String patientDelete(@RequestParam int patientId, ModelMap model) {
		patientServ.remove(patientId);
		List<Patient> plist = patientServ.selectAll();
		model.put("patientList", plist);
		return "patient_list";
	}
	
	@RequestMapping(value = "/patient_update_form")
	public String patientSelect(@RequestParam int patientId, ModelMap model) {
		Patient patient = patientServ.selectById(patientId);
		model.put("patient",patient);
		return "patient_update_form";
	}
	
	@RequestMapping(value = "/patient_update")
	public String productDelete(Patient patient, ModelMap model) {
		patientServ.edit(patient);
		List<Patient> plist = patientServ.selectAll();
		model.put("patientList", plist);
		return "patient_list";
	}
	

}
