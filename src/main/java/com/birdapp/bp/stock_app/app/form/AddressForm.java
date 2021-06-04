package com.birdapp.bp.stock_app.app.form;

import java.util.Locale.IsoCountryCode;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * ADDRESS FORM (abstract form).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class AddressForm extends ContactForm {

	/** COUNTRY. */
	@NotNull
	protected IsoCountryCode country;

	/** STATE. */
	@NotNull
	protected String state;

	/** PREFECTURE. */
	@NotNull
	protected String prefecture;

	/** CITY. */
	@NotNull
	protected String city;

	/** STREET ADDRESS. */
	@NotNull
	protected String streetAddress;

	/** APARTMENT ADDRESS. */
	protected String apartmentAddress;

	/** POSTAL CODE. */
	@NotNull
	protected String postalCode;
}
