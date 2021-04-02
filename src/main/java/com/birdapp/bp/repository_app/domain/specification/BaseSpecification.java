package com.birdapp.bp.repository_app.domain.specification;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

public abstract class BaseSpecification<T extends BaseEntity> {

//	public Specification<T> hasOrgId(Long id) {
//		return StringUtils.isEmpty(id) ? null : (root, query, cb) -> {
//			return cb.equal(root.get("id"), id);
//		};
//	}
}
