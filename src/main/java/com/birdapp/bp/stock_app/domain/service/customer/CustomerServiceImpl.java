package com.birdapp.bp.stock_app.domain.service.customer;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.customer.CustomerEntity;

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
public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<CustomerEntity> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity saveCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity deleteCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


}
