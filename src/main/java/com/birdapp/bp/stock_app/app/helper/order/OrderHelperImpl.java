package com.birdapp.bp.stock_app.app.helper.order;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.order.OrderEntity;

import org.springframework.stereotype.Service;

/**
 * ORDER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class OrderHelperImpl implements OrderHelper{

	@Override
	public List<OrderEntity> getOrderList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderEntity getOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderEntity saveOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public OrderEntity updateOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteOrder() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
