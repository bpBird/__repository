package com.birdapp.bp.repository_app.domain.specification.customer;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.customer.Customer;
import com.birdapp.bp.repository_app.domain.specification.ContactSpecification;

/**
 * SPECIFICATION FOR CUSTOMER.
 *
 * @author bp
 *
 */
public class CustomerSpecification extends ContactSpecification {

	public Specification<Customer> hasCountry(String country) {
		return StringUtils.isEmpty(country) ? null : (root, query, cb) -> {
			return cb.equal(root.get("country"), country);
		};
	}

	public Specification<Customer> hasState(String state) {
		return StringUtils.isEmpty(state) ? null : (root, query, cb) -> {
			return cb.equal(root.get("state"), state);
		};
	}

	public Specification<Customer> hasPrefecture(String prefecture) {
		return StringUtils.isEmpty(prefecture) ? null : (root, query, cb) -> {
			return cb.equal(root.get("prefecture"), prefecture);
		};
	}
}
