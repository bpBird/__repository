package com.birdapp.bp.repository_app.domain.model.organization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * ORGANIZATION ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "organizations")
@Getter
@Setter
public class Organization extends AbstractEntity{

	/** NAME. */
	@Column(name = "NAME")
	private String name;
}
