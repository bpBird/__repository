package com.birdapp.bp.stock_app.domain.specification.product;

import com.birdapp.bp.stock_app.domain.model.product.ProductCategory;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR PRODUCT CATEGORY.
 *
 * @author bp
 *
 */
public class ProductCategorySpecification implements OrganizationSpecification<ProductCategory> {

	public Specification<ProductCategory> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}
}
