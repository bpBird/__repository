package com.birdapp.bp.stock_app.app.form.manufacturer;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.BaseForm;
import com.birdapp.bp.stock_app.app.form.ContactForm;
import com.birdapp.bp.stock_app.app.form.NameForm;
import com.birdapp.bp.stock_app.domain.validation.Email;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER STAFF FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class ManufacturerStaffForm extends BaseForm implements NameForm, ContactForm {

	/** LASTNAME. */
	private String firstname;

	/** FIRSTNAME. */
	private String lastname;

	/** PHONE NUMBER. */
	@Size(min = 10, max = 15)
	protected String phoneNumber;

	/** EMAIL. */
	@NotNull
	@Email
	protected String email;

	/** MANUFACTURER ID. */
	@NotNull
	private Long manufacturerId;
}
