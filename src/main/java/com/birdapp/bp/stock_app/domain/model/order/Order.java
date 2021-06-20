package com.birdapp.bp.stock_app.domain.model.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;
import com.birdapp.bp.stock_app.domain.model.OrganizationField;
import com.birdapp.bp.stock_app.domain.model.customer.Customer;
import com.birdapp.bp.stock_app.domain.model.organization.Organization;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "ORDERS")
@Getter
@Setter
public class Order extends BaseEntity implements OrganizationField {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private Organization organization;

	/** CUSTOMER ID. */
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	/** TOTAL PRICE. */
	@Column(name = "TOTAL_PRICE")
	private BigDecimal totalPrice;

	/** ORDER DATE. */
	@Column(name = "ORDER_DATE")
	private LocalDateTime orderDate;

	/** ORDER STATUS. */
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ORDER_STATUS")
	private OrderStatus orderStatus;

	/** ORDER ITEMS BELONG TO ORDER. */
	@OneToMany(mappedBy="order")
	@Transient
	private List<OrderItem> orderItems;
	
}