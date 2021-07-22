package com.birdapp.bp.stock_app.domain.entity.user;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.entity.BaseEntity;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;
import com.birdapp.bp.stock_app.domain.entity.OrganizationField;
import com.birdapp.bp.stock_app.domain.validation.Email;

import lombok.Getter;

/**
 * USER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "USERS")
@Getter
public class UserEntity extends BaseEntity implements OrganizationField, NameField, ContactField {

	/** ORGANIZATION ID. */
	@Column(name = "ORGANIZATION_ID")
	private Long organizationId;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** PHONE NUMBER. */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	/** EMAIL. */
	@Column(name = "EMAIL")
	@Email
	private String email;

	/** USERNAME. */
	@Column(name = "USERNAME")
	private String username;

	/** BCRYPT PASSWORD. */
	@Column(name = "BCRYPT_PASSWORD")
	private String bcryptPassword;

	/** LOCALE. */
	@Column(name = "LOCALE")
	private Locale locale;

	/** IS ACCOUNT NON LOCKED. */
	@Column(name = "IS_ACCOUNT_NON_LOCKED")
	private Boolean isAccountNonLocked;

	/** AUTHORITY. */
	@Column(name = "AUTHORITY")
	@Enumerated(EnumType.STRING)
	private UserAuthority authority;

	public UserEntity() {
	}

	public UserEntity(UserPostForm userPostForm) {
		this.organizationId = userPostForm.getOrganizationId();
		this.id = userPostForm.getId();
		this.firstname = userPostForm.getFirstname();
		this.lastname = userPostForm.getLastname();
		this.phoneNumber = userPostForm.getPhoneNumber();
		this.email = userPostForm.getEmail();
		this.username = userPostForm.getUsername();
		this.bcryptPassword = userPostForm.getBcryptPassword();
		this.locale = userPostForm.getLocale();
		this.isAccountNonLocked = userPostForm.getIsAccountNonLocked();
		this.authority = userPostForm.getAuthority();
	}
	
}