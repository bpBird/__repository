package com.birdapp.bp.repository_app.app.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.product.ProductCategoryForm;
import com.birdapp.bp.repository_app.domain.model.product.ProductCategory;
import com.birdapp.bp.repository_app.domain.service.product.IProductCategoryService;

/**
 * CONTROLLER FOR PRODUCT CATEGORY.
 *
 * @author bp
 *
 */
public class ProductCategoryController<F extends ProductCategoryForm> {

	@Autowired
	IProductCategoryService iProductCategoryService;

	@GetMapping("/product/category/list")
	public String getProductCategoryList(Model model) {
		List<ProductCategory> productCategoryList = iProductCategoryService.getProductCategoryList();
		model.addAttribute(productCategoryList);
		return "product/category/list";
	}
}
