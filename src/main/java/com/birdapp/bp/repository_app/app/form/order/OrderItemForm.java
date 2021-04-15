package com.birdapp.bp.repository_app.app.form.order;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.BaseForm;

/**
 * ORDER ITEM FORM.
 *
 * @author bp
 *
 */
public class OrderItemForm extends BaseForm {

	/** ORDER ID. */
	@NotNull
	private Long orderId;

	/** PRODUCT ID. */
	@NotNull
	private Long productItemId;

	/** QUANTITY. */
	@NotNull
	//TODO set the appropriate limit
	private int quantity;

	/** TOTAL PRICE. */
	@NotNull
	//TODO set the appropriate limit?
	private BigDecimal totalPrice;
}
