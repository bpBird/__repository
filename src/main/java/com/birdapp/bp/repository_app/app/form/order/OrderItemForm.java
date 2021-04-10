package com.birdapp.bp.repository_app.app.form.order;

import java.math.BigDecimal;

import com.birdapp.bp.repository_app.app.form.BaseForm;

/**
 * ORDER ITEM FORM.
 *
 * @author bp
 *
 */
public class OrderItemForm extends BaseForm {

	/** ORDER ID. */
	private Long orderId;

	/** PRODUCT ID. */
	private Long productItemId;

	/** QUANTITY. */
	private int quantity;

	/** TOTAL PRICE. */
	private BigDecimal totalPrice;
}
