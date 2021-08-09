package com.birdapp.bp.stock_app.app.form.product;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.IdForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;

import lombok.Getter;
import lombok.Setter;

/**
 * PRODUCT CATEGORY FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class ProductCategoryPostForm extends ProductCategoryForm implements IdForm, OrganizationForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;

	/** ID. */
	private Long id;

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;

}
