package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.model.OrganizationField;
import com.birdapp.bp.stock_app.domain.model.organization.Organization;
import com.birdapp.bp.stock_app.domain.model.product.ProductCategory;

import org.springframework.data.jpa.domain.Specification;

/**
 * SPECIFICATION FOR ORGANIZATION.
 *
 * @author bp
 *
 */
public interface OrganizationSpecification<T extends OrganizationField> {
    
	default Specification<Organization> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}
}
