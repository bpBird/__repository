package com.birdapp.bp.stock_app.domain.model.product;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * PRODUCT CATEGORY ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "PRODUCT_CATEGORIES")
@Getter
@Setter
public class ProductCategory extends BaseEntity{

	/** NAME. */
	@Column(name = "NAME")
	private String name;

	/** PRODUCTS BELONG TO PRODUCT CATEGORIES. */
	@OneToMany(mappedBy="productCategory")
	@Transient
	private List<ProductItem> productItems;
	
}