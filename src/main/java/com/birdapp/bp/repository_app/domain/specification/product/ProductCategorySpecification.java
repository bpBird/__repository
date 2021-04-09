package com.birdapp.bp.repository_app.domain.specification.product;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.product.ProductCategory;
import com.birdapp.bp.repository_app.domain.specification.BaseSpecification;

public class ProductCategorySpecification extends BaseSpecification<ProductCategory> {

	public Specification<ProductCategory> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

	public Specification<ProductCategory> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}
}
