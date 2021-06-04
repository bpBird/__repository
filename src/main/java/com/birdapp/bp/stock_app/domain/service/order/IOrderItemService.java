package com.birdapp.bp.stock_app.domain.service.order;

import java.util.List;

import com.birdapp.bp.stock_app.domain.model.order.OrderItem;

/**
 * ORDER ITEM SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IOrderItemService {

	/**
	 * RETURNS THE ORDER ITEM LIST.
	 *
	 * @return {@code ArrayList} oederItemList
	 *
	 */
	List<OrderItem> getOrderItemList();

	/**
	 * RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} orderItem
	 *
	 */
	OrderItem getOrderItem();

	/**
	 * SAVES AND RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} savedOrderItem
	 *
	 */
	OrderItem saveOrderItem();

	/**
	 * UPDATES AND RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} updatedOrder
	 *
	 */
	OrderItem updateOrderItem();

	/**
	 * DELETES AND RETURNS IF THE ORDER ITEM IS DELETED.
	 *
	 * @return {@code true} if OrderItem is deleted
	 *
	 */
	Boolean deleteOrderItem();

}
