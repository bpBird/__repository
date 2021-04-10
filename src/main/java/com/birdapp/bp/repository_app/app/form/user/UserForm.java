package com.birdapp.bp.repository_app.app.form.user;

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
	private Long organizationId;

	/** LASTNAME. */
	private String lastname;

	/** FIRSTNAME. */
	private String firstname;

	/** PASSWORD. */
	private String password;

	/** BCRYPT PASSWORD. */
	private String bcryptPassword;

	/** ROLE. */
	private Rolename rolename;
}
