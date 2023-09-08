package com.shapestone.bootcamp2springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shapestone.bootcamp2springboot.model.Customers;
import com.shapestone.bootcamp2springboot.model.Purchases;
import com.shapestone.bootcamp2springboot.repostitory.CustomerRepository;
import com.shapestone.bootcamp2springboot.repostitory.PurchaseRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customers saveCustomer(Customers customers) {

		return customerRepository.save(customers);
	}

	@Override
	public Customers updateCustomer(Customers customers) {

		return customerRepository.save(customers);
	}

	@Override
	public Customers findByCustomerId(Integer customerId) {

		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customers> findAll() {

		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(Customers customers) {

		customerRepository.delete(customers);
	}

}
