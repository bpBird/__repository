package com.birdapp.bp.stock_app.domain.repository.customer;

import com.birdapp.bp.stock_app.domain.model.customer.Customer;
import com.birdapp.bp.stock_app.domain.specification.customer.CustomerSpecification;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * CUSTOMER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface CustomerRepository
		extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {

	public Page<Customer> findAll(CustomerSpecification specification, Pageable pageable);
}