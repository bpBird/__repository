package com.birdapp.bp.repository_app.app.form;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public abstract class BaseForm implements Serializable {

	/** ID. */
	@NotNull
	protected Long id;

	/** CREATED BY. */
	@NotNull
	protected Long createdBy;

	/** CREATED AT. */
	@NotNull
	protected LocalDateTime createdAt;

	/** UPDATED BY. */
	@NotNull
	protected Long updatedBy;

	/** UPDATED AT. */
	@NotNull
	protected LocalDateTime updatedAt;
}
