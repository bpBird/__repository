package com.birdapp.bp.stock_app.app.helper.product;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.product.ProductCategoryEntity;

/**
 * PRODUCT CATEGORY SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ProductCategoryHelper {

	/**
	 * RETURNS THE PRODUCT CATEGORY LIST.
	 *
	 * @return {@code ArrayList} productCategoryList
	 *
	 */
	List<ProductCategoryEntity> getProductCategoryList();

	/**
	 * RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} productCategory
	 *
	 */
	ProductCategoryEntity getProductCategory();

	/**
	 * SAVES AND RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} savedProductCategory
	 *
	 */
	ProductCategoryEntity saveProductCategory();

	/**
	 * UPDATES AND RETURNS THE PRODUCT CATEGORY.
	 *
	 * @return {@code ProductCategory} updatedProductCategory
	 *
	 */
	ProductCategoryEntity updateProductCategory();

	/**
	 * DELETES AND RETURNS IF THE PRODUCT CATEGORY IS DELETED.
	 *
	 * @return {@code true} if ProductCategory is deleted
	 *
	 */
	Boolean deleteProductCategory();
}
