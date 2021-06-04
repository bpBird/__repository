package com.birdapp.bp.stock_app.domain.model.organization;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.CoreEntity;
import com.birdapp.bp.stock_app.domain.model.customer.Customer;
import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.stock_app.domain.model.order.Order;
import com.birdapp.bp.stock_app.domain.model.product.ProductCategory;
import com.birdapp.bp.stock_app.domain.model.product.ProductItem;
import com.birdapp.bp.stock_app.domain.model.user.User;

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
