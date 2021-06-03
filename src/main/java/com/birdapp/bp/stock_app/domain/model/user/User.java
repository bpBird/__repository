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
@Table(name = "USERS")
@Getter
@Setter
public class User extends ContactEntity {

	/** LASTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** FIRSTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

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