package com.birdapp.bp.stock_app.app.form.order;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.stock_app.app.form.BaseForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDER ITEM FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class OrderItemForm extends BaseForm implements OrganizationForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

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
