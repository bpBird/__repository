package com.birdapp.bp.stock_app.domain.entity.product;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.entity.BaseEntity;
import com.birdapp.bp.stock_app.domain.entity.OrganizationField;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;
import com.birdapp.bp.stock_app.domain.entity.order.OrderItemEntity;
import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

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
public class ProductItemEntity extends BaseEntity implements OrganizationField {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private OrganizationEntity organizationId;

	/** NAME. */
	@Column(name = "NAME")
	private String name;

	/** CATEGORY ID. */
	@ManyToOne
	@JoinColumn(name = "PRODUCT_CATEGORIES_ID")
	private ProductCategoryEntity productCategory;

	/** MANUFACTURER ID. */
	@ManyToOne
	@JoinColumn(name = "MANUFACTURER_ID")
	private ManufacturerEntity manufacturer;

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
	private List<OrderItemEntity> orderItems;

}