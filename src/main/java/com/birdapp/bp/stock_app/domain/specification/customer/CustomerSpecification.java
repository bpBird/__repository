package com.birdapp.bp.stock_app.domain.specification.customer;

import com.birdapp.bp.stock_app.domain.model.customer.Customer;
import com.birdapp.bp.stock_app.domain.specification.AddressSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR CUSTOMER.
 *
 * @author bp
 *
 */
public class CustomerSpecification extends AddressSpecification<Customer> {

	public Specification<Customer> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

	public Specification<Customer> containsLastname(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("lastname"), "%" + name + "%");
		};
	}

	public Specification<Customer> containsFirstname(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("firstname"), "%" + name + "%");
		};
	}
}
