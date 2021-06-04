package com.birdapp.bp.stock_app.domain.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.birdapp.bp.stock_app.domain.model.organization.Organization;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity extends CoreEntity {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private Organization organization;

}