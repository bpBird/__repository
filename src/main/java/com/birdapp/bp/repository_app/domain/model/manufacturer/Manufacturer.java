package com.birdapp.bp.repository_app.domain.model.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "manufacturers")
@Getter
@Setter
public class Manufacturer extends AbstractEntity{

    /** NAME. */
    @Column(name = "NAME")
    private String name;

    /** PHONE NUMBER. */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /** EMAIL. */
    @Column(name = "EMAIL")
    private String email;

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