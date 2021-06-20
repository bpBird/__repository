package com.birdapp.bp.stock_app.domain.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.birdapp.bp.stock_app.domain.model.organization.Organization;

import lombok.Getter;
import lombok.Setter;

/**
 * ORGANIZATION FIELD TO IMPLEMENT .
 *
 * @author bp
 *
 */
public interface OrganizationField {

	public Organization getOrganization();

}