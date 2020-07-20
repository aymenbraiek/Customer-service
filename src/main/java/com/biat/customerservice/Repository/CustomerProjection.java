package com.biat.customerservice.repository;

import org.springframework.data.rest.core.config.Projection;

import com.biat.customerservice.model.Customer;

@Projection(name="p",types = Customer.class)
public interface CustomerProjection {
public Long getId();
public String getName();
}
