package com.birdapp.bp.stock_app.domain.service.customer;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.model.customer.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CUSTOMER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer saveCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


}
