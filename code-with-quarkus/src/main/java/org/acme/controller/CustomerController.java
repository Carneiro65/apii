package org.acme.controller;

import java.util.ArrayList;
import java.util.List;

import org.acme.entity.customer;
import org.acme.service.CustomerService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/customer")

public class CustomerController 
{
    @Inject
    CustomerService customerService;

    @GET
public List<customer> retrieveCustomers()
{
  List<customer> customers = new ArrayList<>();
  
  try{
    customers = customerService.findAllCustomers();
  }
  catch(Exception e) 
    {
      e.printStackTrace();
    }
  return customers;
}

@POST
@Transactional
public void addCustomer (customer Customer)
{
    customerService.addCustomer(Customer);

}




}