package com.biat.customerservice.Controller;

import com.biat.customerservice.Model.Customer;
import com.biat.customerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/biat")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


@GetMapping("/listcustomers")
List<Customer> getAllCustomers()
{ return  customerRepository.findAll();
    }

}
