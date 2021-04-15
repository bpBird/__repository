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

	/**
	 * RETURNS THE PRODUCT CATEGORY LIST.
	 *
	 * @return {@code ArrayList} productCategoryList
	 *
	 */
	List<ProductCategory> getProductCategoryList();

	/**
	 * RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} productCategory
	 *
	 */
	ProductCategory getProductCategory();

	/**
	 * SAVES AND RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} savedProductCategory
	 *
	 */
	ProductCategory saveProductCategory();

	/**
	 * UPDATES AND RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} updatedProductCategory
	 *
	 */
	ProductCategory updateProductCategory();

	/**
	 * DELETES AND RETURNS IF THE PRODUCT CATEGORY IS DELETED.
	 *
	 * @return {@code true} if ProductCategory is deleted
	 *
	 */
	Boolean deleteProductCategory();
}
