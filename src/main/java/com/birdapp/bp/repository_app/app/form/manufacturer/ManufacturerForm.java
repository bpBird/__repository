package com.birdapp.bp.repository_app.app.form.manufacturer;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.AddressForm;

/**
 * MANUFACTURER FORM.
 *
 * @author bp
 *
 */
public class ManufacturerForm extends AddressForm {

	/** ORGANIZATION ID. */
	@NotNull
    private Long organizationId;

    /** NAME. */
	@NotNull
    private String name;
}
