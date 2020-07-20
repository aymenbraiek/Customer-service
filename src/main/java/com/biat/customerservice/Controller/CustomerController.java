package com.biat.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biat.customerservice.model.Customer;
import com.biat.customerservice.repository.CustomerRepository;

@RestController
@RequestMapping("/biat")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/listcustomers")
	List<Customer> getAllCustomers()
	{
		return customerRepository.findAll();
	}

}
