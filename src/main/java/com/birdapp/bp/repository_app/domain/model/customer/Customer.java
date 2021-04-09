package com.birdapp.bp.repository_app.domain.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AddressEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * CUSTOMER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer extends AddressEntity {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATIONS_ID")
	private Long organizationId;

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;
}