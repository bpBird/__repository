package com.birdapp.bp.repository_app.app.form.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

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
	@NotNull
	private Long organizationId;

	/** CUSTOMER ID. */
	@NotNull
	private Long customerId;

	/** TOTAL PRICE. */
	@NotNull
	//TODO set the appropriate limit
	private BigDecimal totalPrice;

	/** ORDER DATE. */
	@NotNull
	//TODO set the appropriate limit
	private LocalDateTime orderDate;

	/** ORDER STATUS. */
	@NotNull
	//TODO set the default value
	private OrderStatus orderStatus;
}
