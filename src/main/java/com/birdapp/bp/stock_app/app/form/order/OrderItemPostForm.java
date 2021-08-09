package com.birdapp.bp.stock_app.app.form.order;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.stock_app.app.form.IdForm;
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
public class OrderItemPostForm extends OrderItemForm implements IdForm, OrganizationForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

	/** ID. */
	private Long id;

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
