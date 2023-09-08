package com.shapestone.bootcamp2springboot.service;

import java.util.List;

import com.shapestone.bootcamp2springboot.model.Customers;
import com.shapestone.bootcamp2springboot.model.Purchases;

public interface CustomerService {

	public Customers saveCustomer(Customers customers);
	
	public Customers updateCustomer(Customers customers);
	
	public Customers findByCustomerId(Integer customerId);
	
	public List<Customers> findAll();
	
	public void deleteCustomer(Customers customers);
	
}
