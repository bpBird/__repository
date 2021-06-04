package com.birdapp.bp.stock_app.domain.repository.order;

import com.birdapp.bp.stock_app.domain.model.order.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * ORDER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface OrderRepository
		extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {

}