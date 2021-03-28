package com.birdapp.bp.repository_app.app.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.product.ProductItemForm;
import com.birdapp.bp.repository_app.domain.model.product.ProductItem;
import com.birdapp.bp.repository_app.domain.service.product.IProductItemService;

/**
 * CONTROLLER FOR PRODUCT ITEM.
 *
 * @author bp
 *
 */
@Controller
public class ProductItemController<F extends ProductItemForm> {

	@Autowired
	IProductItemService iProductItemService;

	@GetMapping("/product/item/list")
	public String getProductItemList(Model model) {
		List<ProductItem> productItemList = iProductItemService.getProductItemList();
		model.addAttribute(productItemList);
		return "product/item/list";
	}
}
