package com.fusion.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.fusion.model.Order;

@Path("/orders")
@Component
public class OrderRestService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Order> getOrders() {
    	ArrayList<Order> Orders = new ArrayList<Order>();
    	Orders.add(new Order(1233, "Iphone",900.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone-X",1200.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone 7",700.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone 10",1000.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Samsung Note",1100.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Samsung S9",1000.00,"10/12/2017"));
    	
    	return Orders;
    }
}