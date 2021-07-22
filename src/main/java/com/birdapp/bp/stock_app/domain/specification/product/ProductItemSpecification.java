package com.birdapp.bp.stock_app.domain.specification.product;

import java.math.BigDecimal;

import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

public class ProductItemSpecification implements OrganizationSpecification<ProductItemEntity> {

	public Specification<ProductItemEntity> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}

	public Specification<ProductItemEntity> hasProductCategoryId(Long productCategoryId) {
		return productCategoryId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productCategoryId"), "%" + productCategoryId + "%");
		};
	}

	public Specification<ProductItemEntity> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}

	public Specification<ProductItemEntity> fromToBuyingPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("buyingPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<ProductItemEntity> fromToSellingPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("sellingPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<ProductItemEntity> fromToInhouseStockQuantity(Integer minimumQuantity, Integer maximumQuantity) {
		return minimumQuantity == null && maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.between(root.get("inhouseStock"), minimumQuantity, maximumQuantity);
		};
	}

	public Specification<ProductItemEntity> fromToArrivingStockQuantity(Integer minimumQuantity, Integer maximumQuantity) {
		return minimumQuantity == null && maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.between(root.get("arrivingStock"), minimumQuantity, maximumQuantity);
		};
	}
}
