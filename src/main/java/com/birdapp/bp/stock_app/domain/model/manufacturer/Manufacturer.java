package com.birdapp.bp.repository_app.domain.model.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AddressEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "manufacturers")
@Getter
@Setter
public class Manufacturer extends AddressEntity{

	/** ORGANIZATION ID. */
	@ManyToOne
	@JoinColumn(name = "ORGANIZATIONS_ID")
    private Long organizationId;

    /** NAME. */
    @Column(name = "NAME")
    private String name;

}