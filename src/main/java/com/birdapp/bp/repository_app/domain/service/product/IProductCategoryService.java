package com.birdapp.bp.repository_app.domain.service.product;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.product.ProductCategory;

/**
 * PRODUCT CATEGORY SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IProductCategoryService {

	List<ProductCategory> getProductCategoryList();

	ProductCategory getProductCategory();

	boolean saveProductCategory();

	boolean updateProductCategory();

	boolean deleteProductCategory();
}
