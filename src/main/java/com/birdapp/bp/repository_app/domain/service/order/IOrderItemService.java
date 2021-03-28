package com.birdapp.bp.repository_app.domain.service.order;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.order.OrderItem;

/**
 * ORDER ITEM SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IOrderItemService {

	List<OrderItem> getOrderItemList();

	OrderItem getOrderItem();

	boolean registerOrderItem();

	boolean updateOrderItem();

	boolean deleteOrderItem();

}
