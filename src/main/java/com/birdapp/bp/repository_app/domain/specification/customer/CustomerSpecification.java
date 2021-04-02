package com.birdapp.bp.repository_app.domain.specification.customer;

import org.springframework.data.jpa.domain.Specification;

import com.birdapp.bp.repository_app.domain.model.customer.Customer;

public class CustomerSpecification {
	public Specification<Customer> containsName(String name) {
		return null;
	}

	public Specification<Customer> hasPhoneNumber(String email) {
		return null;
	}

	public Specification<Customer> hasEmail(String email) {
		return null;
	}

	public Specification<Customer> hasCountry() {
		return null;
	}

	public Specification<Customer> hasState() {
		return null;
	}

	public Specification<Customer> hasPrefecture() {
		return null;
	}
}
