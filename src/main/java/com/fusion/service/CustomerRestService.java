package com.fusion.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.fusion.model.Customer;

@Path("/customers")
@Component
public class CustomerRestService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Customer> getCustomers() {
    	ArrayList<Customer> customers = new ArrayList<Customer>();
    	customers.add(new Customer("John", "Smith","John.Smith@kenbengmail.com","+1 3124567898"));
    	customers.add(new Customer("Jenny", "Smith","Jenny.Smith@kenbengmail.com","+1 3124567898"));
    	customers.add(new Customer("Shawn", "Doe","Shawn.Doe@kenbengmail.com","+1 3124562342"));
    	customers.add(new Customer("Drunk", "Bro","Drunk.Bro@kenbengmail.com","+1 3124562342"));
    	return customers;
    }
}