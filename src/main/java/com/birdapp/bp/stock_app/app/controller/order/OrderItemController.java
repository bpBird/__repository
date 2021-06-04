package com.birdapp.bp.stock_app.app.controller.order;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.order.OrderItemForm;
import com.birdapp.bp.stock_app.domain.model.order.OrderItem;
import com.birdapp.bp.stock_app.domain.service.order.IOrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CONTROLLER FOR ORDER ITEMS.
 *
 * @author bp
 *
 */
@Controller
public class OrderItemController <F extends OrderItemForm> {

	@Autowired
	IOrderItemService iOrderItemService;

	@GetMapping("/order/item/list")
	public String getOrderItemList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<OrderItem> orderItemList = iOrderItemService.getOrderItemList();
		model.addAttribute(orderItemList);
		return "/order/item/list";
	}

	@GetMapping("/order/item/edit-modal")
	String editOrderItem (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "order/item/edit";
	}
}
