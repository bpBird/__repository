package com.birdapp.bp.repository_app.domain.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.Contact;

import lombok.Getter;
import lombok.Setter;

/**
 * CUSTOMER DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer extends Contact {

    /** COUNTRY. */
    @Column(name = "COUNTRY")
    private String country;

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