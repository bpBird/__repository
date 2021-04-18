package com.birdapp.bp.repository_app.app.form.customer;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.AddressForm;

import lombok.Getter;
import lombok.Setter;

/**
 * CUSTOMER FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class CustomerForm extends AddressForm {

	/** LASTNAME. */
	@NotNull
	private String lastname;

	/** FIRSTNAME. */
	private String firstname;
}
