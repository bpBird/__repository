package com.birdapp.bp.repository_app.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class orderController {

	@GetMapping("/order/list")
	public String getOrderList() {
	    return "/order/list";
	}
}
