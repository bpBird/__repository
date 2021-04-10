package com.birdapp.bp.repository_app.domain.specification.order;

import java.math.BigDecimal;

import org.springframework.data.jpa.domain.Specification;

import com.birdapp.bp.repository_app.domain.model.order.OrderItem;
import com.birdapp.bp.repository_app.domain.specification.BaseSpecification;

public class OrderItemSpecification extends BaseSpecification<OrderItem> {

	public Specification<OrderItem> hasOrderId(Long orderId) {
		return orderId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("orderId"), orderId);
		};
	}

	public Specification<OrderItem> hasProductItemId(Long productItemId) {
		return productItemId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productItemId"), productItemId);
		};
	}

	public Specification<OrderItem> moreThanQuantity(Integer minimumQuantity) {
		return minimumQuantity == null ? null : (root, query, cb) -> {
			return cb.greaterThan(root.get("quantity"), minimumQuantity);
		};
	}

	public Specification<OrderItem> lessThanQuantity(Integer maximumQuantity) {
		return maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.lessThan(root.get("quantity"), maximumQuantity);
		};
	}

	public Specification<OrderItem> moreThanTotalPrice(BigDecimal minimumPrice) {
		return minimumPrice == null ? null : (root, query, cb) -> {
			return cb.greaterThan(root.get("totalPrice"), minimumPrice);
		};
	}

	public Specification<OrderItem> lessThanTotalPrice(BigDecimal maximumPrice) {
		return maximumPrice == null ? null : (root, query, cb) -> {
			return cb.lessThan(root.get("totalPrice"), maximumPrice);
		};
	}
}
