package com.birdapp.bp.repository_app.domain.model.organization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.CoreEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * ORGANIZATION ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "organizations")
@Getter
@Setter
public class Organization extends CoreEntity{

	/** NAME. */
	@Column(name = "NAME")
	private String name;

	/** ACTIVATE STATUS. */
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ACTIVATE_STATUS")
	private ActivateStatus activateStatus;

	/** USERS BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<User> users;

	/** CUSTOMERS BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<Customer> customers;

	/** MANUFACTURERS BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<Manufacturer> manufacturers;

	/** PRODUCT CATEGORIES BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<ProductCategory> productCategories;

	/** PRODUCT ITEMS BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<ProductItem> productItems;

	/** ORDERS BELONG TO ORGANIZATION. */
	@OneToMany(mappedBy="organization")
	@Transient
	private List<Order> orders;
	
}
