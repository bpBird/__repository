package com.birdapp.bp.stock_app.domain.repository.order;

import com.birdapp.bp.stock_app.domain.model.order.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * ORDER ITEM REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface OrderItemRepository
		extends JpaRepository<OrderItem, Long>, JpaSpecificationExecutor<OrderItem> {
}