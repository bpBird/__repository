package com.birdapp.bp.stock_app.domain.service.customer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.model.customer.Customer;

/**
 * CUSTOMER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ICustomerService {

	List<Customer> getCustomerList(
//			Long id,
//			String name,
//			Optional<String> phoneNumber,
//			Optional<String> email,
//			Optional<String> country,
//			Optional<String> state,
//			Optional<String> prefecture
			);

	Customer getCustomer();

	Customer saveCustomer();

	Customer updateCustomer();

	Customer deleteCustomer();

}
