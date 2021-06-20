package com.birdapp.bp.stock_app.domain.model.manufacturer;

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
import com.birdapp.bp.stock_app.domain.model.OrganizationField;
import com.birdapp.bp.stock_app.domain.model.organization.Organization;
import com.birdapp.bp.stock_app.domain.model.product.ProductItem;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "MANUFACTURERS")
@Getter
@Setter
public class Manufacturer extends BaseEntity implements OrganizationField,
														ContactField,
														AddressField {

    /** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID")
	private Organization organization;

    /** NAME. */
    @Column(name = "NAME")
    private String name;

    /** PRODUCT ITEMS BELONG TO MANUFACTURER. */
    @OneToMany(mappedBy="manufacturer")
    @Transient
    private List<ProductItem> productItems;

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
    
}