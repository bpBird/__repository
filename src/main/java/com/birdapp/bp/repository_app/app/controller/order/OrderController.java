package com.birdapp.bp.repository_app.app.controller.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.order.OrderForm;
import com.birdapp.bp.repository_app.domain.model.order.Order;
import com.birdapp.bp.repository_app.domain.service.order.IOrderService;

/**
 * CONTROLLER FOR ORDERS.
 *
 * @author bp
 *
 */
@Controller
public class OrderController<F extends OrderForm> {

	@Autowired
	IOrderService iOrderService;

	@GetMapping("/order/list")
	public String getOrderList(Model model) {
		List<Order> orderList = iOrderService.getOrderList();
		model.addAttribute(orderList);
		return "/order/list";
	}
}
