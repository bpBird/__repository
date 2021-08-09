package com.birdapp.bp.stock_app.app.specification.customer;

import com.birdapp.bp.stock_app.app.specification.AddressSpecification;
import com.birdapp.bp.stock_app.app.specification.ContactSpecification;
import com.birdapp.bp.stock_app.app.specification.NameSpecification;
import com.birdapp.bp.stock_app.app.specification.OrganizationSpecification;
import com.birdapp.bp.stock_app.domain.entity.AddressField;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;
import com.birdapp.bp.stock_app.domain.entity.customer.CustomerEntity;

/**
 * SPECIFICATION FOR CUSTOMER.
 *
 * @author bp
 *
 */
public class CustomerSpecification implements OrganizationSpecification<CustomerEntity>,
											  NameSpecification<CustomerEntity>,
											  ContactSpecification<CustomerEntity>,
											  AddressSpecification<CustomerEntity> {

}
