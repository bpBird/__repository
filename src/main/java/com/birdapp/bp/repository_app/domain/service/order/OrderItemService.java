package com.birdapp.bp.repository_app.domain.service.order;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.order.OrderItem;

/**
 * ORDER ITEM SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class OrderItemService implements IOrderItemService {

	@Override
	public List<OrderItem> getOrderItemList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderItem getOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean registerOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
