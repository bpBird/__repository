package com.birdapp.bp.repository_app.app.form;

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
public abstract class BaseForm extends AbstractForm {

	/** ORGANIZATION ID. */
	@NotNull
	private Long organizationId;
}
