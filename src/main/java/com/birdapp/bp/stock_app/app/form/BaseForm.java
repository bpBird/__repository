package com.birdapp.bp.stock_app.app.form;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * BASE FORM (abstract form).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseForm extends CoreForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;
}
