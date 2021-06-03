package com.birdapp.bp.repository_app.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.ContactEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * USER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends ContactEntity {

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATIONS_ID")
	private Long organizationId;

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** PASSWORD. */
	private String password;

	/** BCRYPT PASSWORD. */
	@Column(name = "BCRYPT_PASSWORD")
	private String bcryptPassword;

	/** ROLE. */
	@Column(name = "ROLENAME")
	@Enumerated(EnumType.STRING)
	private Rolename rolename;
}