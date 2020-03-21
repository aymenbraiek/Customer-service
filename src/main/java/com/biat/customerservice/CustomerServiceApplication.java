package com.biat.customerservice;


import com.biat.customerservice.Model.Customer;
import com.biat.customerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class CustomerServiceApplication  implements CommandLineRunner{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
	    repositoryRestConfiguration.exposeIdsFor(Customer.class);
	    customerRepository.save(new Customer(null,"aymen202","ymen@esprit.tn")) ;
        customerRepository.save(new Customer(null,"aymen203","aymen@esprit.tn")) ;
        customerRepository.save(new Customer(null,"aymen204","bymen@esprit.tn")) ;
        customerRepository.save(new Customer(null,"aymen205","dymen@esprit.tn")) ;
        customerRepository.findAll().forEach(System.out::println);
    }
}
