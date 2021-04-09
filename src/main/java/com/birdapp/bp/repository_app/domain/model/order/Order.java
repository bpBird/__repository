package com.birdapp.bp.repository_app.domain.model.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order extends BaseEntity{

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATIONS_ID")
	private Long organizationId;

	/** CUSTOMER ID. */
	@ManyToOne
	@JoinColumn(name = "CUSTOMERS_ID")
	private Long customerId;

	/** TOTAL PRICE. */
	@Column(name = "TOTAL_PRICE")
	private BigDecimal totalPrice;

	/** ORDER DATE. */
	@Column(name = "ORDER_DATE")
	private LocalDateTime orderDate;

	/** ORDER STATUS. */
	@Enumerated(EnumType.STRING)
	@Column(name = "ORDER_STATUS")
	private OrderStatus orderStatus;
}