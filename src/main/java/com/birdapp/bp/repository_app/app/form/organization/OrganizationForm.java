package com.birdapp.bp.repository_app.app.form.organization;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.repository_app.app.form.AbstractForm;

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
public class OrganizationForm extends AbstractForm {

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;
}
