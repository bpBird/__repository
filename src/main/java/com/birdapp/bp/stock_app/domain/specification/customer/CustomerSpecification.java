package com.birdapp.bp.stock_app.domain.specification.customer;

import com.birdapp.bp.stock_app.domain.entity.AddressField;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;
import com.birdapp.bp.stock_app.domain.entity.customer.CustomerEntity;
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
public class CustomerSpecification implements OrganizationSpecification<CustomerEntity>,
											  NameSpecification<CustomerEntity>,
											  ContactSpecification<CustomerEntity>,
											  AddressSpecification<CustomerEntity> {

}
