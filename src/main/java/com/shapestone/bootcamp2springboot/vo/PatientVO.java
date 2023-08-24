package com.shapestone.bootcamp2springboot.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@JsonIgnoreProperties
public class PatientVO {

	private int patientId;
	private String name;
	private int age;
	private String gender;
	private String address;
	private List<TreatmentVO> treatments;

	public List<TreatmentVO> getTreatments() {
		return treatments;
	}

	public void setTreatments(List<TreatmentVO> treatments) {
		this.treatments = treatments;
	}

	
	public PatientVO() {
		super();
	}


	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PatientVO [patientId=" + patientId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + "]";
	}

}
