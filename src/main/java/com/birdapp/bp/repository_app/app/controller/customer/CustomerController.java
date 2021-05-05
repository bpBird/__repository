package com.birdapp.bp.repository_app.app.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.customer.CustomerForm;
import com.birdapp.bp.repository_app.domain.model.customer.Customer;
import com.birdapp.bp.repository_app.domain.service.customer.ICustomerService;

/**
 * CONTROLLER FOR CUSTOMER.
 *
 * @author bp
 *
 */
@Controller
public class CustomerController<F extends CustomerForm> {

	@Autowired
	ICustomerService iCustomerService;

	@GetMapping("/customer/list")
	public String getCustomerList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<Customer> customerList = iCustomerService.getCustomerList();
		model.addAttribute(customerList);
		return "customer/list";
	}

	@GetMapping("/customer/edit-modal")
	String editCustomer (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "customer/edit";
	}
}
