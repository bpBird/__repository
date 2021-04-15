package com.birdapp.bp.repository_app.app.form.customer;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.AddressForm;

/**
 * CUSTOMER FORM.
 *
 * @author bp
 *
 */
public class CustomerForm extends AddressForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

	/** LASTNAME. */
	@NotNull
	private String lastname;

	/** FIRSTNAME. */
	private String firstname;
}
