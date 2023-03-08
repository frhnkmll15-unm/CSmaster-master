package com.juaracoding.CSmaster.controller;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 07/03/2023 00:00
@Last Modified 07/03/2023 00:00
Version 1.0
*/


import com.juaracoding.CSmaster.model.Customer;
import com.juaracoding.CSmaster.model.EtcD;
import com.juaracoding.CSmaster.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "/api/v1/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(
			method = RequestMethod.GET,
			produces = APPLICATION_JSON_VALUE,
			value = "/current")
	public Customer getCustomer(){
		return customerService.getCustomerCurr();
	}

	@RequestMapping(
			method = RequestMethod.POST,
			produces = APPLICATION_JSON_VALUE,
			value = "/desired")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Customer updateCustomer(@RequestBody Customer customer){
		customerService.setDesiredState(customer.getFirstName(), customer.getLastName(), customer.getEmail());
		return customerService.getCustomerDes();
	}

	@RequestMapping(
			method = RequestMethod.GET,
			produces = APPLICATION_JSON_VALUE,
			value = "/reconcile")
	public EtcD reconiledState(){
		return customerService.getReconciler();
	}


}
