package com.birdapp.bp.stock_app.domain.entity.product;

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
import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

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
public class ProductCategoryEntity extends BaseEntity implements OrganizationField {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private OrganizationEntity organizationId;

	/** NAME. */
	@Column(name = "NAME")
	private String name;

	/** PRODUCTS BELONG TO PRODUCT CATEGORIES. */
	@OneToMany(mappedBy="productCategory")
	@Transient
	private List<ProductItemEntity> productItems;
	
}