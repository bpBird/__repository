package com.birdapp.bp.repository_app.domain.service.order;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.order.Order;

/**
 * ORDER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IOrderService {

	List<Order> getOrderList();

	Order getOrder();

	boolean registerOrder();

	boolean updateOrder();

	boolean deleteOrder();

}
