package com.birdapp.bp.repository_app.app.form;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public abstract class BaseForm implements Serializable {

	/** ID. */
	@NotNull
	protected Long id;

	/** CREATED BY. */
	@NotNull
	protected Long createdBy;

	/** CREATED AT. */
	@NotNull
	@DateTimeFormat
	protected LocalDateTime createdAt;

	/** UPDATED BY. */
	@NotNull
	protected Long updatedBy;

	/** UPDATED AT. */
	@NotNull
	@DateTimeFormat
	protected LocalDateTime updatedAt;
}
