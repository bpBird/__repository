package com.birdapp.bp.stock_app.domain.model.order;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;
import com.birdapp.bp.stock_app.domain.model.product.ProductItem;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDERED ITEM ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "ORDER_ITEMS")
@Getter
@Setter
public class OrderItem extends BaseEntity{

	/** ORDER ID. */
	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	/** PRODUCT ITEM ID. */
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ITEM_ID")
	private ProductItem ProductItem;

	/** QUANTITY. */
	@Column(name = "QUANTITY")
	private int quantity;

	/** TOTAL PRICE. */
	@Column(name = "TOTAL_PRICE")
	private BigDecimal totalPrice;

}