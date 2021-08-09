package com.birdapp.bp.stock_app.app.controller.product;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.product.ProductItemPostForm;
import com.birdapp.bp.stock_app.app.helper.product.ProductItemHelper;
import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CONTROLLER FOR PRODUCT ITEM.
 *
 * @author bp
 *
 */
@Controller
public class ProductItemController<F extends ProductItemPostForm> {

	@Autowired
	ProductItemHelper iProductItemService;

	@GetMapping("/product/list")
	public String getProductItemList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<ProductItemEntity> productItemList = iProductItemService.getProductItemList();
		model.addAttribute(productItemList);
		return "product/item/list";
	}

	@GetMapping("/product/edit-modal")
	String editProduct (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "product/item/edit";
	}
}
