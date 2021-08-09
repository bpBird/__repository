package com.birdapp.bp.stock_app.app.specification.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.birdapp.bp.stock_app.domain.entity.order.OrderEntity;

import org.springframework.data.jpa.domain.Specification;

public class OrderSpecification {

	public Specification<OrderEntity> hasCustomerId(Long customerId) {
		return customerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("customerId"), customerId);
		};
	}

	public Specification<OrderEntity> hasProductItemId(Long productItemId) {
		return productItemId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productItemId"), productItemId);
		};
	}

	public Specification<OrderEntity> fromToTotalPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("totalPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<OrderEntity> fromToOrderDate(LocalDateTime startingDate, LocalDateTime endDate) {
		return startingDate == null && endDate == null ? null : (root, query, cb) -> {
			return cb.between(root.get("orderDate"), startingDate, endDate);
		};
	}
}
