package com.birdapp.bp.repository_app.domain.service.customer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.customer.Customer;

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
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Customer getCustomer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean registerCustomer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateCustomer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteCustomer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
