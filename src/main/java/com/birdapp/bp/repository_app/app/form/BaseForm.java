package com.birdapp.bp.repository_app.app.form;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class BaseForm implements Serializable {

	/** ID. */
	protected Long id;

	/** CREATED BY. */
	protected Long createdBy;

	/** CREATED AT. */
	protected LocalDateTime createdAt;

	/** UPDATED BY. */
	protected Long updatedBy;

	/** UPDATED AT. */
	protected LocalDateTime updatedAt;
}
