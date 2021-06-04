package com.birdapp.bp.stock_app.app.form.user;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.birdapp.bp.stock_app.app.form.ContactForm;
import com.birdapp.bp.stock_app.domain.model.user.Rolename;

import lombok.Getter;
import lombok.Setter;

/**
 * USER FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class UserForm extends ContactForm {

	/** LASTNAME. */
	private String lastname;

	/** FIRSTNAME. */
	private String firstname;

	/** PASSWORD. */
	@NotNull
	private String password;

	/** BCRYPT PASSWORD. */
	@NotNull
	private String bcryptPassword;

	/** ROLE. */
	@NotNull
	@Enumerated(EnumType.STRING)
	private Rolename rolename;
}
