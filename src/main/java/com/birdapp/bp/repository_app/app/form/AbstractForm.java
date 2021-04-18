package com.birdapp.bp.repository_app.app.form;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

/**
 * ABSTRACT FORM (abstract form).
 *
 * @author bp
 *
 */
@MappedSuperclass
@Getter
@Setter
public abstract class AbstractForm implements Serializable {

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
