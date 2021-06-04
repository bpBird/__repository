package com.birdapp.bp.stock_app.app.form.organization;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.CoreForm;

import lombok.Getter;
import lombok.Setter;

/**
 * ORGANIZATION FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class OrganizationForm extends CoreForm {

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;
}
