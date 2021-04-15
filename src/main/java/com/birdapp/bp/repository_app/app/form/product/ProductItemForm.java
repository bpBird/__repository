package com.birdapp.bp.repository_app.app.form.product;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.BaseForm;

/**
 * PRODUCT ITEM FORM.
 *
 * @author bp
 *
 */
public class ProductItemForm extends BaseForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

	/** NAME. */
	@NotNull
	private String name;

	/** CATEGORY ID. */
	private Long productCategoryId;

	/** MANUFACTURER ID. */
	private Long manufacturerId;

	/** BUYING PRICE. */
	@DecimalMax("9999999.99")
	private BigDecimal buyingPrice;

	/** SELLING PRICE. */
	@NotNull
	@DecimalMax("9999999.99")
	private BigDecimal sellingPrice;

	/** INHOUSE STOCK. */
	//TODO set the appropriate limit
	private int inhouseStock;

	/** ARRIVING STOCK. */
	//TODO set the appropriate limit
	private int arrivingStock;

}
