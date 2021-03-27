package com.birdapp.bp.repository_app.domain.model.manufacturer;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.Contact;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER STAFF DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "manufacturer_staff")
@Getter
@Setter
public class ManufacturerStaff extends Contact {

    /** MANUFACTURER ID. */
    @ManyToOne
    @JoinColumn(name = "MANUFACTURERS_ID")
    private Long manufacturerId;
}