package com.birdapp.bp.stock_app.app.helper.order;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.order.OrderItemEntity;

import org.springframework.stereotype.Service;

/**
 * ORDER ITEM SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class OrderItemHelperImpl implements OrderItemHelper {

	@Override
	public List<OrderItemEntity> getOrderItemList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderItemEntity getOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderItemEntity saveOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderItemEntity updateOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteOrderItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
