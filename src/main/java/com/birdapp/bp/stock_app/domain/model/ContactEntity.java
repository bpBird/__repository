package com.birdapp.bp.stock_app.domain.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * CONTACT ENTITY (Abstract Entity).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class ContactEntity extends BaseEntity {

	/** PHONE NUMBER. */
	@Column(name = "PHONE_NUMBER")
	protected String phoneNumber;

	/** EMAIL. */
	@Column(name = "EMAIL")
	protected String email;
	
}