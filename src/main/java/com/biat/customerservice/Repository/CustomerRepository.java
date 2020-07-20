package com.biat.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.biat.customerservice.model.Customer;
@RepositoryRestController
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
