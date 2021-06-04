package com.birdapp.bp.stock_app.app.form.product;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.BaseForm;

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
public class ProductCategoryForm extends BaseForm {

	/** NAME. */
	@NotNull
	@Size(min = 1, max = 255)
	private String name;

}
