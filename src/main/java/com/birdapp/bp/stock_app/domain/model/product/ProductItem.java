package com.birdapp.bp.stock_app.domain.model.product;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;
import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.stock_app.domain.model.order.OrderItem;

import lombok.Getter;
import lombok.Setter;

/**
 * PRODUCT ITEM ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "PRODUCT_ITEMS")
@Getter
@Setter
public class ProductItem extends BaseEntity{

	/** NAME. */
	@Column(name = "NAME")
	private String name;

	/** CATEGORY ID. */
	@ManyToOne
	@JoinColumn(name = "PRODUCT_CATEGORIES_ID")
	private ProductCategory productCategory;

	/** MANUFACTURER ID. */
	@ManyToOne
	@JoinColumn(name = "MANUFACTURER_ID")
	private Manufacturer manufacturer;

	/** BUYING PRICE. */
	@Column(name = "BUYING_PRICE")
	private BigDecimal buyingPrice;

	/** SELLING PRICE. */
	@Column(name = "SELLING_PRICE")
	private BigDecimal sellingPrice;

	/** INHOUSE STOCK. */
	@Column(name = "INHOUSE_STOCK")
	private int inhouseStock;

	/** ARRIVING STOCK. */
	@Column(name = "ARRIVING_STOCK")
	private int arrivingStock;

	/** ORDERED ITEMS ASSOCIATED WITH PRODUCT ITEM. */
	@OneToMany(mappedBy="productItem")
	@Transient
	private List<OrderItem> orderItems;

}