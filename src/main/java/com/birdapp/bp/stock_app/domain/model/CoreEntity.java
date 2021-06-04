package com.birdapp.bp.stock_app.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class CoreEntity implements Serializable {

	/** ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	/** CREATED BY. */
	@CreatedBy
	@Column(name = "CREATED_BY")
	protected Long createdBy;

	/** CREATED AT. */
	@CreatedDate
	@Column(name = "CREATED_AT")
	protected LocalDateTime createdAt;

	/** UPDATED BY. */
	@LastModifiedBy
	@Column(name = "UPDATED_BY")
	protected Long lastUpdatedBy;

	/** UPDATED AT. */
	// @Version
	@LastModifiedDate
	@Column(name = "UPDATED_AT")
	protected LocalDateTime lastUpdatedAt;
	
}
