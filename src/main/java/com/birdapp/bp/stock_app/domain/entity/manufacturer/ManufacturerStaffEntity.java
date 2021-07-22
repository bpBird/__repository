package com.birdapp.bp.stock_app.domain.entity.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.stock_app.domain.entity.BaseEntity;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER STAFF ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "MANUFACTURER_STAFF")
@Getter
@Setter
public class ManufacturerStaffEntity extends BaseEntity implements NameField,
															 ContactField {

	/** LASTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** FIRSTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** PHONE NUMBER. */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	/** EMAIL. */
	@Column(name = "EMAIL")
	private String email;

	/** MANUFACTURER ID. */
	@ManyToOne
	@JoinColumn(name = "MANUFACTURER_ID")
	private ManufacturerEntity manufacturer;
}