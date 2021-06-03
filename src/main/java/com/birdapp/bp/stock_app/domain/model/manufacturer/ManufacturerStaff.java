package com.birdapp.bp.repository_app.domain.model.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.ContactEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER STAFF ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "manufacturer_staff")
@Getter
@Setter
public class ManufacturerStaff extends ContactEntity {

	/** LASTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** FIRSTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** MANUFACTURER ID. */
	@ManyToOne
	@JoinColumn(name = "MANUFACTURERS_ID")
	private Long manufacturerId;
}