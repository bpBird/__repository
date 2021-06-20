package com.birdapp.bp.stock_app.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;
import com.birdapp.bp.stock_app.domain.model.ContactField;
import com.birdapp.bp.stock_app.domain.model.NameField;
import com.birdapp.bp.stock_app.domain.model.OrganizationField;
import com.birdapp.bp.stock_app.domain.model.organization.Organization;

import lombok.Getter;
import lombok.Setter;

/**
 * USER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User extends BaseEntity implements OrganizationField, NameField, ContactField {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private Organization organization;

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** PHONE NUMBER. */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	/** EMAIL. */
	@Column(name = "EMAIL")
	private String email;

	/** PASSWORD. */
	@Column(name = "PASSWORD")
	private String password;

	// /** PASSWORD. */
	// @Transient
	// private String password;

	// /** BCRYPT PASSWORD. */
	// @Column(name = "BCRYPT_PASSWORD")
	// private String bcryptPassword;

	/** ROLE. */
	@Column(name = "ROLENAME")
	@Enumerated(EnumType.STRING)
	private Rolename rolename;
	
}