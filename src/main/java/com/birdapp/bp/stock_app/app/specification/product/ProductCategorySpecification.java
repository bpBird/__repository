package com.birdapp.bp.stock_app.app.specification.product;

import com.birdapp.bp.stock_app.app.specification.OrganizationSpecification;
import com.birdapp.bp.stock_app.domain.entity.product.ProductCategoryEntity;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR PRODUCT CATEGORY.
 *
 * @author bp
 *
 */
public class ProductCategorySpecification implements OrganizationSpecification<ProductCategoryEntity> {

	public Specification<ProductCategoryEntity> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}
}
