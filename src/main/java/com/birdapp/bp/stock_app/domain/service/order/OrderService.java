package com.birdapp.bp.stock_app.domain.service.order;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.model.order.Order;

import org.springframework.stereotype.Service;

/**
 * ORDER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class OrderService implements IOrderService{

	@Override
	public List<Order> getOrderList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Order getOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Order saveOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Order updateOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
