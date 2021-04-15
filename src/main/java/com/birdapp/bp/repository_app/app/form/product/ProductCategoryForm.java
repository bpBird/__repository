package com.birdapp.bp.repository_app.app.form.product;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.repository_app.app.form.BaseForm;

/**
 * PRODUCT CATEGORY FORM.
 *
 * @author bp
 *
 */
public class ProductCategoryForm extends BaseForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;

}
