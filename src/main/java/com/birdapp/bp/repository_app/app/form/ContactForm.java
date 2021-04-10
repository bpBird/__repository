package com.birdapp.bp.repository_app.app.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public abstract class ContactForm extends BaseForm{

	/** PHONE NUMBER. */
	@NotNull
	@Size(min = 10, max = 15)
	protected String phoneNumber;

	/** EMAIL. */
	@NotNull
	@Size(min = 1, max = 100)
	@Email
	protected String email;
}
