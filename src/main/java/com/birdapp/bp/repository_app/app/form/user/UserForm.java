package com.birdapp.bp.repository_app.app.form.user;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.ContactForm;
import com.birdapp.bp.repository_app.domain.model.user.Rolename;

/**
 * USER FORM.
 *
 * @author bp
 *
 */
public class UserForm extends ContactForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

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
	private Rolename rolename;
}
