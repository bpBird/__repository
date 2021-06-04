package com.birdapp.bp.stock_app.domain.specification.product;

import java.math.BigDecimal;

import com.birdapp.bp.stock_app.domain.model.product.ProductItem;
import com.birdapp.bp.stock_app.domain.specification.BaseSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

public class ProductItemSpecification extends BaseSpecification<ProductItem> {

	public Specification<ProductItem> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

	public Specification<ProductItem> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}

	public Specification<ProductItem> hasProductCategoryId(Long productCategoryId) {
		return productCategoryId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productCategoryId"), "%" + productCategoryId + "%");
		};
	}

	public Specification<ProductItem> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}

	public Specification<ProductItem> fromToBuyingPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("buyingPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<ProductItem> fromToSellingPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("sellingPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<ProductItem> fromToInhouseStockQuantity(Integer minimumQuantity, Integer maximumQuantity) {
		return minimumQuantity == null && maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.between(root.get("inhouseStock"), minimumQuantity, maximumQuantity);
		};
	}

	public Specification<ProductItem> fromToArrivingStockQuantity(Integer minimumQuantity, Integer maximumQuantity) {
		return minimumQuantity == null && maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.between(root.get("arrivingStock"), minimumQuantity, maximumQuantity);
		};
	}
}
