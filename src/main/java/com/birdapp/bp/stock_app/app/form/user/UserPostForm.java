package com.birdapp.bp.stock_app.app.form.user;

import java.util.Locale;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.IdForm;
import com.birdapp.bp.stock_app.app.form.ContactForm;
import com.birdapp.bp.stock_app.app.form.NameForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;
import com.birdapp.bp.stock_app.app.form.common.RegisterForm;
import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.validation.Email;
import com.birdapp.bp.stock_app.domain.validation.PasswordConfirmation;

import lombok.Getter;

/**
 * USER POST FORM.
 *
 * @author bp
 *
 */
@Getter
public class UserPostForm extends UserForm implements IdForm, OrganizationForm, NameForm, ContactForm {

	private Long id;

	@NotNull
	private Long organizationId;

	@Size(max = 100)
	private String firstname;

	@Size(max = 100)
	private String lastname;

	@NotNull
	private String email;

	@Size(min = 10, max = 15)
	private String phoneNumber;

	@NotNull
	@Size(min = 1, max = 100)
	private String username;

	@NotNull
	@Size(min = 6, max = 60)
	private String password;

	@NotNull
	@Size(min = 6, max = 60)
	private String confirmPassword;

	@NotNull
	private Locale locale;

	@NotNull
	private Boolean isAccountNonLocked;

	@NotNull
	@Enumerated(EnumType.STRING)
	private UserAuthority authority;

	public UserPostForm() {
	}

	// public UserPostForm(RegisterForm registerForm) {
	// 	this.firstname = registerForm.getUserPostForm().getFirstname();
	// 	this.lastname = registerForm.getUserPostForm().getLastname();
	// 	this.email = registerForm.getUserPostForm().getEmail();
	// 	this.phoneNumber = registerForm.getUserPostForm().getPhoneNumber();
	// 	this.bcryptPassword = registerForm.getUserPostForm().getBcryptPassword();
	// 	this.locale = registerForm.getUserPostForm().getLocale();
	// 	this.isAccountNonLocked = registerForm.getUserPostForm().getIsAccountNonLocked();
	// 	this.authority = registerForm.getUserPostForm().getAuthority();
	// }

	public UserPostForm(UserEntity userEntity) {
		this.id = userEntity.getId();
		this.organizationId = userEntity.getOrganizationId();
		this.firstname = userEntity.getFirstname();
		this.lastname = userEntity.getLastname();
		this.email = userEntity.getEmail();
		this.phoneNumber = userEntity.getPhoneNumber();
		this.password = userEntity.getBcryptPassword();
		this.locale = userEntity.getLocale();
		this.isAccountNonLocked = userEntity.getIsAccountNonLocked();
		this.authority = userEntity.getAuthority();
	}

}
