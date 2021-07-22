package com.birdapp.bp.stock_app.app.form.manufacturer;

import java.util.Locale.IsoCountryCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.AddressForm;
import com.birdapp.bp.stock_app.app.form.BaseForm;
import com.birdapp.bp.stock_app.app.form.ContactForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;
import com.birdapp.bp.stock_app.domain.validation.Email;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class ManufacturerForm extends BaseForm implements OrganizationForm, ContactForm, AddressForm {

   	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

    /** NAME. */
	@NotNull
    private String name;

	/** PHONE NUMBER. */
	@NotNull
	@Size(min = 10, max = 15)
	protected String phoneNumber;

	/** EMAIL. */
	@NotNull
	@Email
	protected String email;

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
