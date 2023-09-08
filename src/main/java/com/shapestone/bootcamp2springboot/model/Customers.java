package com.shapestone.bootcamp2springboot.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CustomerTable")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "address")
	private String address;

	

	@OneToMany(mappedBy = "customers", cascade = CascadeType.ALL,fetch= FetchType.EAGER)
	private List<Purchases> purchases;
	
	
	public List<Purchases> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchases> purchases) {
		if (purchases == null) {
			purchases = new ArrayList<>();
		}
		purchases.forEach(purchase -> purchase.setCustomers(this));
		this.purchases = purchases;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
		return "Customers [customerId=" + customerId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + "]";
	}

	public Customers(int customerId, String name, int age, String gender, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

}
