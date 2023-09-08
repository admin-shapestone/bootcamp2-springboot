package com.shapestone.bootcamp2springboot.controller;

import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shapestone.bootcamp2springboot.model.Customers;
import com.shapestone.bootcamp2springboot.model.Purchases;
import com.shapestone.bootcamp2springboot.service.CustomerService;

@RestController
public class Controller {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/Customer")
	public Customers saveCustomer(@RequestBody Customers customers) {
		customerService.saveCustomer(customers);
		return customers;
	}
   
	@GetMapping(value = "getAllCustomers")
	public List<Customers> findAll() {
		return customerService.findAll();
	}

	
	  @PutMapping("updateCustomer") public Customers updateCustomer(@RequestBody
	  Customers customers) { return customerService.updateCustomer(customers);
	  
	  }
	  
	  @DeleteMapping("deleteCustomer") public String deleteCustomer(@RequestParam
	  Customers customerId) { customerService.deleteCustomer(customerId); return
	  "Customer Deleted"; }
	 
}
