package com.biat.customerservice.Repository;

import com.biat.customerservice.Model.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Customer.class)
public interface CustomerProjection {
/*  lorsque je voulai afficher que l'id et le name de customer j'utlise l'interface projection suivant /customers/1?projection=p1*/
    public  Long getId();
    public  String getName();
}
