package com.birdapp.bp.repository_app.app.form.product;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.validation.constraints.DecimalMax;

/**
 * PRODUCT ITEM FORM.
 *
 * @author bp
 *
 */
public class ProductItemForm implements Serializable {

	/** ORGANIZATION ID. */
	private Long organizationId;

	/** NAME. */
	private String name;

	/** CATEGORY ID. */
	private Long productCategoryId;

	/** MANUFACTURER ID. */
	private Long manufacturerId;

	/** BUYING PRICE. */
	@DecimalMax("9999999.99")
	private BigDecimal buyingPrice;

	/** SELLING PRICE. */
	@DecimalMax("9999999.99")
	private BigDecimal sellingPrice;

	/** INHOUSE STOCK. */
	@Column(name = "INHOUSE_STOCK")
	private int inhouseStock;

	/** ARRIVING STOCK. */
	@Column(name = "ARRIVING_STOCK")
	private int arrivingStock;

}
