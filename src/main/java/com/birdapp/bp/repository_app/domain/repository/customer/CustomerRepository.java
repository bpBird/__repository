package com.birdapp.bp.repository_app.domain.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.customer.Customer;
import com.birdapp.bp.repository_app.domain.model.product.ProductItem;

/**
 * CUSTOMER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface CustomerRepository
		extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<ProductItem> {

}