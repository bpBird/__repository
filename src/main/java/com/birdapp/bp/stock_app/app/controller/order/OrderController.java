package com.birdapp.bp.stock_app.app.controller.order;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.order.OrderForm;
import com.birdapp.bp.stock_app.domain.entity.order.OrderEntity;
import com.birdapp.bp.stock_app.domain.service.order.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CONTROLLER FOR ORDERS.
 *
 * @author bp
 *
 */
@Controller
public class OrderController<F extends OrderForm> {

	@Autowired
	OrderService iOrderService;

	@GetMapping("/order/list")
	public String getOrderList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<OrderEntity> orderList = iOrderService.getOrderList();
		model.addAttribute(orderList);
		return "/order/list";
	}

	@GetMapping("/order/edit-modal")
	String editOrder (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "order/edit";
	}
}
