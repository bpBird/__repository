package com.birdapp.bp.stock_app.domain.model.customer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.AddressEntity;
import com.birdapp.bp.stock_app.domain.model.order.Order;

import lombok.Getter;
import lombok.Setter;

/**
 * CUSTOMER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "CUSTOMERS")
@Getter
@Setter
public class Customer extends AddressEntity {

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** ORDERS BELONG TO CUSTOMER. */
	@OneToMany(mappedBy="customer")
	@Transient
	private List<Order> orders;

}