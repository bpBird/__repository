package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.entity.OrganizationField;

import org.springframework.data.jpa.domain.Specification;

/**
 * SPECIFICATION FOR ORGANIZATION.
 *
 * @author bp
 *
 */
public interface OrganizationSpecification<T extends OrganizationField> {

	default Specification<T> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

}
