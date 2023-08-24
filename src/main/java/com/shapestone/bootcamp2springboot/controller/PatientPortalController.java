package com.shapestone.bootcamp2springboot.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shapestone.bootcamp2springboot.model.Patient;
import com.shapestone.bootcamp2springboot.model.Treatment;
import com.shapestone.bootcamp2springboot.service.PatientInterfaceService;
import com.shapestone.bootcamp2springboot.vo.PatientVO;
import com.shapestone.bootcamp2springboot.vo.TreatmentVO;

@RestController
public class PatientPortalController {
	@Autowired
	private PatientInterfaceService patientIntService;

	@PostMapping(value = "/savePatient")
	public PatientVO savePatient(@RequestBody PatientVO patient) {
		Patient p = new Patient();
		p.setAddress(patient.getAddress());
		p.setAge(patient.getAge());
		p.setGender(patient.getGender());
		p.setName(patient.getName());
		p.setTreatments(getTreatMentsFromVO(patient.getTreatments(), p));
		Patient savePatient = patientIntService.savePatient(p);
		
		return transformtoVO(savePatient);
	}

	private PatientVO transformtoVO(Patient savePatient) {
		PatientVO vo = new PatientVO();
		vo.setAddress(savePatient.getAddress());
		vo.setAge(savePatient.getAge());
		vo.setGender(savePatient.getGender());
		vo.setName(savePatient.getName());
		vo.setPatientId(savePatient.getPatientId());
		return vo;
		
	}

	private List<Treatment> getTreatMentsFromVO(List<TreatmentVO> treatments, Patient p) {
		return treatments.stream().map(vo -> {
			Treatment t = new Treatment();
			t.setCost(vo.getCost());
			t.setDateOfTreatment(vo.getDateOfTreatment());
			t.setDiagnosis(vo.getDiagnosis());
			t.setPatient(p);
			t.setTreatment(vo.getTreatment());
			return t;
		}).collect(Collectors.toList());
		
	}

	@GetMapping(value = "getAllPatient")
	public List<Patient> findAll() {
		return patientIntService.findAll();
	}

	@PostMapping(value = "ubdatePatient")
	public Patient ubdatePatient(@RequestBody Patient patient) {
		return patientIntService.ubdatePatient(patient);
	}

	@DeleteMapping(value = "deletepatient")
	public String deletepatient(@RequestParam Patient patientId) {
		patientIntService.deletePatient(patientId);
		return "PatientVO Deleted";
	}
}