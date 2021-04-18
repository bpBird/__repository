package com.birdapp.bp.repository_app.app.form.manufacturer;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.ContactForm;

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
public class ManufacturerStaffForm extends ContactForm {

	/** LASTNAME. */
	private String firstname;

	/** FIRSTNAME. */
	private String lastname;

	/** MANUFACTURER ID. */
	@NotNull
	private Long manufacturerId;
}
