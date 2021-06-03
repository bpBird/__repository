package com.birdapp.bp.repository_app.domain.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;
}