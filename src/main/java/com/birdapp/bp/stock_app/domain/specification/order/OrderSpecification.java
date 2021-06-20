package com.birdapp.bp.stock_app.domain.specification.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.birdapp.bp.stock_app.domain.model.order.Order;

import org.springframework.data.jpa.domain.Specification;

public class OrderSpecification {

	public Specification<Order> hasCustomerId(Long customerId) {
		return customerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("customerId"), customerId);
		};
	}

	public Specification<Order> hasProductItemId(Long productItemId) {
		return productItemId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productItemId"), productItemId);
		};
	}

	public Specification<Order> fromToTotalPrice(BigDecimal minimumPrice, BigDecimal maximumPrice) {
		return minimumPrice == null && maximumPrice == null ? null : (root, query, cb) -> {
			return cb.between(root.get("totalPrice"), minimumPrice, maximumPrice);
		};
	}

	public Specification<Order> fromToOrderDate(LocalDateTime startingDate, LocalDateTime endDate) {
		return startingDate == null && endDate == null ? null : (root, query, cb) -> {
			return cb.between(root.get("orderDate"), startingDate, endDate);
		};
	}
}
