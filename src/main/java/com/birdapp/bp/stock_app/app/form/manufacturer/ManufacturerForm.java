package com.birdapp.bp.repository_app.app.form.manufacturer;

import javax.validation.constraints.NotNull;

import com.birdapp.bp.repository_app.app.form.AddressForm;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class ManufacturerForm extends AddressForm {

    /** NAME. */
	@NotNull
    private String name;
}
