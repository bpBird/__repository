package com.birdapp.bp.stock_app.domain.specification.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.birdapp.bp.stock_app.domain.model.order.Order;
import com.birdapp.bp.stock_app.domain.specification.BaseSpecification;

import org.springframework.data.jpa.domain.Specification;

public class OrderSpecification extends BaseSpecification<Order> {

	public Specification<Order> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

	public Specification<Order> hasCustomerId(Long customerId) {
		return customerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("customerId"), customerId);
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
