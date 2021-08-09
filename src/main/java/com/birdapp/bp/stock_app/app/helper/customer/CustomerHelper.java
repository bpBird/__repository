package com.birdapp.bp.stock_app.app.helper.customer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.customer.CustomerEntity;

/**
 * CUSTOMER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface CustomerHelper {

	List<CustomerEntity> getCustomerList(
//			Long id,
//			String name,
//			Optional<String> phoneNumber,
//			Optional<String> email,
//			Optional<String> country,
//			Optional<String> state,
//			Optional<String> prefecture
			);

	CustomerEntity getCustomer();

	CustomerEntity saveCustomer();

	CustomerEntity updateCustomer();

	CustomerEntity deleteCustomer();

}
