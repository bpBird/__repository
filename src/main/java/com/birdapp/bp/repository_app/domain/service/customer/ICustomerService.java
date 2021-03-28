package com.birdapp.bp.repository_app.domain.service.customer;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.customer.Customer;

/**
 * CUSTOMER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ICustomerService {

	List<Customer> getCustomerList();

	Customer getCustomer();

	boolean registerCustomer();

	boolean updateCustomer();

	boolean deleteCustomer();

}
