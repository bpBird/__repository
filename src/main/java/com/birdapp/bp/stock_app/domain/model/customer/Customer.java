package com.birdapp.bp.stock_app.domain.model.customer;

import java.util.List;
import java.util.Locale.IsoCountryCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.AddressField;
import com.birdapp.bp.stock_app.domain.model.BaseEntity;
import com.birdapp.bp.stock_app.domain.model.ContactField;
import com.birdapp.bp.stock_app.domain.model.NameField;
import com.birdapp.bp.stock_app.domain.model.OrganizationField;
import com.birdapp.bp.stock_app.domain.model.order.Order;
import com.birdapp.bp.stock_app.domain.model.organization.Organization;

import lombok.Getter;
import lombok.Setter;

/**
 * CUSTOMER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "CUSTOMERS")
@Getter
@Setter
public class Customer extends BaseEntity implements OrganizationField,
													NameField,
													ContactField,
													AddressField {

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

	/** COUNTRY. */
	@Column(name = "COUNTRY")
	@Enumerated(EnumType.STRING)
	private IsoCountryCode country;

	/** STATE. */
	@Column(name = "STATE")
	private String state;

	/** PREFECTURE. */
	@Column(name = "PREFECTURE")
	private String prefecture;

	/** CITY. */
	@Column(name = "CITY")
	private String city;

	/** STREET ADDRESS. */
	@Column(name = "STREET_ADDRESS")
	private String streetAddress;

	/** APARTMENT ADDRESS. */
	@Column(name = "APARTMENT_ADDRESS")
	private String apartmentAddress;

	/** POSTAL CODE. */
	@Column(name = "POSTAL_CODE")
	private String postalCode;

	/** ORDERS BELONG TO CUSTOMER. */
	@OneToMany(mappedBy="customer")
	@Transient
	private List<Order> orders;

}