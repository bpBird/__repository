package com.birdapp.bp.repository_app.domain.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

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