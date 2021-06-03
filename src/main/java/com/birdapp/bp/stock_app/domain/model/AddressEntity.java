package com.birdapp.bp.repository_app.domain.model;

import java.util.Locale.IsoCountryCode;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * ADDRESS ENTITY (Abstract Class).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class AddressEntity extends ContactEntity{

	/** COUNTRY. */
	@Column(name = "COUNTRY")
	@Enumerated(EnumType.STRING)
	protected IsoCountryCode country;

	/** STATE. */
	@Column(name = "STATE")
	protected String state;

	/** PREFECTURE. */
	@Column(name = "PREFECTURE")
	protected String prefecture;

	/** CITY. */
	@Column(name = "CITY")
	protected String city;

	/** STREET ADDRESS. */
	@Column(name = "STREET_ADDRESS")
	protected String streetAddress;

	/** APARTMENT ADDRESS. */
	@Column(name = "APARTMENT_ADDRESS")
	protected String apartmentAddress;

	/** POSTAL CODE. */
	@Column(name = "POSTAL_CODE")
	protected String postalCode;
}
