package com.birdapp.bp.stock_app.app.form.user;

import java.util.Locale;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.controller.user.UserForm;
import com.birdapp.bp.stock_app.app.form.BaseForm;
import com.birdapp.bp.stock_app.app.form.ContactForm;
import com.birdapp.bp.stock_app.app.form.NameForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;
import com.birdapp.bp.stock_app.app.form.RegisterForm;
import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.validation.Email;

import lombok.Getter;

/**
 * USER FORM.
 *
 * @author bp
 *
 */
@Getter
public class UserPostForm extends UserForm implements BaseForm, OrganizationForm, NameForm, ContactForm {

	private Long id;

	@NotNull
	private Long organizationId;

	@Size(max = 100)
	private String firstname;

	@Size(max = 100)
	private String lastname;

	@NotNull
	@Email
	private String email;

	@Size(min = 10, max = 15)
	private String phoneNumber;

	@NotNull
	@Size(min = 1, max = 100)
	private String username;

	@NotNull
	@Size(min = 60)
	private String bcryptPassword;

	@NotNull
	private Locale locale;

	@NotNull
	private Boolean isAccountNonLocked;

	@NotNull
	@Enumerated(EnumType.STRING)
	private UserAuthority authority;

	UserPostForm() {
	}

	public UserPostForm(RegisterForm registerForm) {
		this.firstname = registerForm.getFirstname();
		this.lastname = registerForm.getLastname();
		this.email = registerForm.getEmail();
		this.phoneNumber = registerForm.getPhoneNumber();
		this.bcryptPassword = registerForm.getBcryptPassword();
		this.locale = registerForm.getLocale();
		this.isAccountNonLocked = registerForm.getIsAccountNonLocked();
		this.authority = registerForm.getAuthority();
	}

}
