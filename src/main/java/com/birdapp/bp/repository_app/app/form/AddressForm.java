package com.birdapp.bp.repository_app.app.form;

import java.util.Locale.IsoCountryCode;

public abstract class AddressForm extends ContactForm {

	/** COUNTRY. */
	protected IsoCountryCode country;

	/** STATE. */
	protected String state;

	/** PREFECTURE. */
	protected String prefecture;

	/** CITY. */
	protected String city;

	/** STREET ADDRESS. */
	protected String streetAddress;

	/** APARTMENT ADDRESS. */
	protected String apartmentAddress;

	/** POSTAL CODE. */
	protected String postalCode;
}
