package com.birdapp.bp.repository_app.app.form.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.birdapp.bp.repository_app.app.form.BaseForm;
import com.birdapp.bp.repository_app.domain.model.order.OrderStatus;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDER FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class OrderForm extends BaseForm {

	/** CUSTOMER ID. */
	@NotNull
	private Long customerId;

	/** TOTAL PRICE. */
	@NotNull
	//TODO set the appropriate limit
	private BigDecimal totalPrice;

	/** ORDER DATE. */
	@NotNull
	@DateTimeFormat
	//TODO set the appropriate limit
	private LocalDateTime orderDate;

	/** ORDER STATUS. */
	@NotNull
	//TODO set the default value
	private OrderStatus orderStatus;
}
