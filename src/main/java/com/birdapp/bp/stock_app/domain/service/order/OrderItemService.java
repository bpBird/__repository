package com.birdapp.bp.stock_app.domain.service.order;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.model.order.OrderItem;

import org.springframework.stereotype.Service;

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
	public OrderItem saveOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderItem updateOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
