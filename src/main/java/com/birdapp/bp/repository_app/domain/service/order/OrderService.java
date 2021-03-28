package com.birdapp.bp.repository_app.domain.service.order;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.order.Order;

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
	public boolean registerOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
