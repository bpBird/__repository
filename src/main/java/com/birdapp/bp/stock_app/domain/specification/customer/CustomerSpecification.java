package com.birdapp.bp.stock_app.domain.specification.customer;

import com.birdapp.bp.stock_app.domain.model.AddressField;
import com.birdapp.bp.stock_app.domain.model.ContactField;
import com.birdapp.bp.stock_app.domain.model.NameField;
import com.birdapp.bp.stock_app.domain.model.customer.Customer;
import com.birdapp.bp.stock_app.domain.specification.AddressSpecification;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;
import com.birdapp.bp.stock_app.domain.specification.NameSpecification;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

/**
 * SPECIFICATION FOR CUSTOMER.
 *
 * @author bp
 *
 */
public class CustomerSpecification implements OrganizationSpecification<Customer>,
											  NameSpecification<Customer>,
											  ContactSpecification<Customer>,
											  AddressSpecification<Customer> {

}
