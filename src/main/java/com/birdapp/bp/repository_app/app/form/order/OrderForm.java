package com.birdapp.bp.repository_app.app.form.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.birdapp.bp.repository_app.app.form.BaseForm;
import com.birdapp.bp.repository_app.domain.model.order.OrderStatus;

/**
 * ORDER FORM.
 *
 * @author bp
 *
 */
public class OrderForm extends BaseForm {

	/** ORGANIZATION ID. */
	private Long organizationId;

	/** CUSTOMER ID. */
	private Long customerId;

	/** TOTAL PRICE. */
	private BigDecimal totalPrice;

	/** ORDER DATE. */
	private LocalDateTime orderDate;

	/** ORDER STATUS. */
	private OrderStatus orderStatus;
}
