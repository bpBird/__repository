package com.birdapp.bp.stock_app.domain.entity.organization;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.app.form.organization.OrganizationPostForm;
import com.birdapp.bp.stock_app.domain.constant.status.organization.ActivateStatus;
import com.birdapp.bp.stock_app.domain.entity.BaseEntity;
import com.birdapp.bp.stock_app.domain.entity.customer.CustomerEntity;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;
import com.birdapp.bp.stock_app.domain.entity.order.OrderEntity;
import com.birdapp.bp.stock_app.domain.entity.product.ProductCategoryEntity;
import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * ORGANIZATION ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "organizations")
@Getter
@Setter
public class OrganizationEntity extends BaseEntity {

	@Column(name = "NAME")
	private String name;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ACTIVATE_STATUS")
	private ActivateStatus activateStatus;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<UserEntity> users;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<CustomerEntity> customers;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<ManufacturerEntity> manufacturers;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<ProductCategoryEntity> productCategories;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<ProductItemEntity> productItems;

	@OneToMany(mappedBy="organization")
	@Transient
	private List<OrderEntity> orders;

	public OrganizationEntity(OrganizationPostForm organizationPostForm) {
		this.name = organizationPostForm.getName();
		this.activateStatus = organizationPostForm.getActivateStatus();
	}
	
}
