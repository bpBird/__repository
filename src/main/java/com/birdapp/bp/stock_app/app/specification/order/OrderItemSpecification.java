package com.birdapp.bp.stock_app.app.specification.order;

import java.math.BigDecimal;

import com.birdapp.bp.stock_app.domain.entity.order.OrderItemEntity;

import org.springframework.data.jpa.domain.Specification;

/**
 * SPECIFICATION FOR ORDER ITEM.
 *
 * @author bp
 *
 */
public class OrderItemSpecification {

	public Specification<OrderItemEntity> hasOrderId(Long orderId) {
		return orderId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("orderId"), orderId);
		};
	}

	public Specification<OrderItemEntity> hasProductItemId(Long productItemId) {
		return productItemId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("productItemId"), productItemId);
		};
	}

	public Specification<OrderItemEntity> moreThanQuantity(Integer minimumQuantity) {
		return minimumQuantity == null ? null : (root, query, cb) -> {
			return cb.greaterThan(root.get("quantity"), minimumQuantity);
		};
	}

	public Specification<OrderItemEntity> lessThanQuantity(Integer maximumQuantity) {
		return maximumQuantity == null ? null : (root, query, cb) -> {
			return cb.lessThan(root.get("quantity"), maximumQuantity);
		};
	}

	public Specification<OrderItemEntity> moreThanTotalPrice(BigDecimal minimumPrice) {
		return minimumPrice == null ? null : (root, query, cb) -> {
			return cb.greaterThan(root.get("totalPrice"), minimumPrice);
		};
	}

	public Specification<OrderItemEntity> lessThanTotalPrice(BigDecimal maximumPrice) {
		return maximumPrice == null ? null : (root, query, cb) -> {
			return cb.lessThan(root.get("totalPrice"), maximumPrice);
		};
	}
}
