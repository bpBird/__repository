package com.birdapp.bp.stock_app.app.helper.order;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.order.OrderEntity;

/**
 * ORDER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface OrderHelper {

	/**
	 * RETURNS THE ORDER LIST.
	 *
	 * @return {@code ArrayList} orderList
	 *
	 */
	List<OrderEntity> getOrderList();

	/**
	 * RETURNS THE ORDER.
	 *
	 * @return {@code Order} order
	 *
	 */
	OrderEntity getOrder();

	/**
	 * SAVES AND RETURNS THE ORDER.
	 *
	 * @return {@code Order} savedOrder
	 *
	 */
	OrderEntity saveOrder();

	/**
	 * UPDATES AND RETURNS THE ORDER.
	 *
	 * @return {@code Order} updatedOrder
	 *
	 */
	OrderEntity updateOrder();

	/**
	 * DELETES AND RETURNS IF THE ORDER IS DELETED.
	 *
	 * @return {@code true} if Order is deleted
	 *
	 */
	Boolean deleteOrder();

}
