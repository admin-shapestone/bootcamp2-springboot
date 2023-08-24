package com.shapestone.bootcamp2springboot.service;

import java.util.List;

import com.shapestone.bootcamp2springboot.model.Patient;

public interface PatientInterfaceService {
	public Patient savePatient(Patient patient);

	public Patient ubdatePatient(Patient patient);

	public Patient findBypatientId(Integer patinetId);

	public List<Patient> findAll();

	public void deletePatient(Patient Patient);

}
