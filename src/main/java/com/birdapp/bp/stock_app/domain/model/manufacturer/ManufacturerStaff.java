package com.birdapp.bp.stock_app.domain.model.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.stock_app.domain.model.ContactEntity;

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
public class ManufacturerStaff extends ContactEntity {

	/** LASTNAME. */
	@Column(name = "FIRSTNAME")
	private String firstname;

	/** FIRSTNAME. */
	@Column(name = "LASTNAME")
	private String lastname;

	/** MANUFACTURER ID. */
	@ManyToOne
	@JoinColumn(name = "MANUFACTURER_ID")
	private Manufacturer manufacturer;
}