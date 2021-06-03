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

	/**
	 * RETURNS THE ORDER LIST.
	 *
	 * @return {@code ArrayList} orderList
	 *
	 */
	List<Order> getOrderList();

	/**
	 * RETURNS THE ORDER.
	 *
	 * @return {@code Order} order
	 *
	 */
	Order getOrder();

	/**
	 * SAVES AND RETURNS THE ORDER.
	 *
	 * @return {@code Order} savedOrder
	 *
	 */
	Order saveOrder();

	/**
	 * UPDATES AND RETURNS THE ORDER.
	 *
	 * @return {@code Order} updatedOrder
	 *
	 */
	Order updateOrder();

	/**
	 * DELETES AND RETURNS IF THE ORDER IS DELETED.
	 *
	 * @return {@code true} if Order is deleted
	 *
	 */
	Boolean deleteOrder();

}
