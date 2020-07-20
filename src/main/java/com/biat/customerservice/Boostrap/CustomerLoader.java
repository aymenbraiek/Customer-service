package com.biat.customerservice.Boostrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.stereotype.Component;

import com.biat.customerservice.model.Customer;
import com.biat.customerservice.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Component
public class CustomerLoader implements CommandLineRunner {
@Autowired
CustomerRepository customerRepository;
@Autowired
RepositoryRestConfiguration configuration;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(customerRepository.count()==0)
		{
			loadDataCustomers();
		}
	}
	private void loadDataCustomers() {
		configuration.exposeIdsFor(Customer.class);
		// TODO Auto-generated method stub
		customerRepository.save(new Customer("aymen braiek","aymen.braiek@esprit.tn"));
		customerRepository.save(new Customer("amir braiek","aymexxxxxxxxx@esprit.tn"));
		customerRepository.save(new Customer("ilhem braiek","aymen.braiek@esprit.tn"));
		customerRepository.findAll().forEach(System.out::println);
		
		
	}

}
