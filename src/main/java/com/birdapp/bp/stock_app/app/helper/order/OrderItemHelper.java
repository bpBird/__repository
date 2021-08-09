package com.birdapp.bp.stock_app.app.helper.order;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.order.OrderItemEntity;

/**
 * ORDER ITEM SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface OrderItemHelper {

	/**
	 * RETURNS THE ORDER ITEM LIST.
	 *
	 * @return {@code ArrayList} oederItemList
	 *
	 */
	List<OrderItemEntity> getOrderItemList();

	/**
	 * RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} orderItem
	 *
	 */
	OrderItemEntity getOrderItem();

	/**
	 * SAVES AND RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} savedOrderItem
	 *
	 */
	OrderItemEntity saveOrderItem();

	/**
	 * UPDATES AND RETURNS THE ORDER ITEM.
	 *
	 * @return {@code OrderItem} updatedOrder
	 *
	 */
	OrderItemEntity updateOrderItem();

	/**
	 * DELETES AND RETURNS IF THE ORDER ITEM IS DELETED.
	 *
	 * @return {@code true} if OrderItem is deleted
	 *
	 */
	Boolean deleteOrderItem();

}
