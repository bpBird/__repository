package com.birdapp.bp.repository_app.domain.specification;

import org.springframework.data.jpa.domain.Specification;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

public abstract class BaseSpecification<T> extends CoreSpecification<BaseEntity> {

	public Specification<T> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}
}
