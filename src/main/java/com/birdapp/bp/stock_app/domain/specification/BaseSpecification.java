package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.model.BaseEntity;

import org.springframework.data.jpa.domain.Specification;

public abstract class BaseSpecification<T> extends CoreSpecification<BaseEntity> {

	public Specification<T> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}
}
