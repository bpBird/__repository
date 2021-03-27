package com.birdapp.bp.repository_app.domain.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * ORDER DATA.
 *
 * @author bp
 *
 */
@MappedSuperclass
public abstract class Contact extends AbstractEntity {

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
}