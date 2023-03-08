package com.juaracoding.CSmaster.service;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 07/03/2023 00:06
@Last Modified 07/03/2023 00:06
Version 1.0
*/

import com.juaracoding.CSmaster.model.Customer;
import com.juaracoding.CSmaster.model.EtcD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	EtcD reconciler;

	public Customer setCurrentState() {
		Customer customer = new Customer();
		customer.setFirstName("Muhammad");
		customer.setLastName("FarhanKamil");
		customer.setEmail("CSmaster@github.io");
		reconciler.setCurrentState(customer);
		return customer;
	}

	public void setDesiredState(String firstName, String lastName, String email){
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		reconciler.setDesiredState(customer);
	}

	public Customer getCustomerCurr() {
		setCurrentState();
		return reconciler.getCurrentState();
	}

	public Customer getCustomerDes(){
		return reconciler.getDesiredState();
	}

	public EtcD getReconciler(){
		return reconciler;
	}
}

