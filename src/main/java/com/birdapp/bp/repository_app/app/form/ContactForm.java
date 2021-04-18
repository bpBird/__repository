package com.birdapp.bp.repository_app.app.form;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.repository_app.domain.validation.Email;

import lombok.Getter;
import lombok.Setter;

/**
 * CONTACT FORM (abstract form).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class ContactForm extends BaseForm{

	/** PHONE NUMBER. */
	@NotNull
	@Size(min = 10, max = 15)
	protected String phoneNumber;

	/** EMAIL. */
	@NotNull
	@Email
	protected String email;
}
