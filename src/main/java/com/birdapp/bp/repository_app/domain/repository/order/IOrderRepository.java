package com.birdapp.bp.repository_app.domain.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.order.Order;

/**
 * ORDER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
}