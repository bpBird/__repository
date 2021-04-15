package com.birdapp.bp.repository_app.app.form.organization;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.repository_app.app.form.BaseForm;

public class OrganizationForm extends BaseForm {

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;
}
