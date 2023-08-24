package com.shapestone.bootcamp2springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shapestone.bootcamp2springboot.model.Patient;
import com.shapestone.bootcamp2springboot.repostitory.PatientPortalRepository;

@Service
public class PatirntService implements PatientInterfaceService {
@Autowired
private PatientPortalRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient ubdatePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient findBypatientId(Integer patientId) {
		return patientRepository.findById(patientId).get();
	}

	@Override
	public List<Patient> findAll() {
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public void deletePatient(Patient Patient) {
		patientRepository.delete(Patient);
	}

}
