package com.birdapp.bp.stock_app.domain.service.product;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;

/**
 * PRODUCT ITEM SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ProductItemService {

	/**
	 * RETURNS THE PRODUCT ITEM LIST.
	 *
	 * @return {@code ArrayList} productItemList
	 *
	 */
	List<ProductItemEntity> getProductItemList();

	/**
	 * RETURNS THE PRODUCT ITEM.
	 *
	 * @return {@code ProductItem} productItem
	 *
	 */
	ProductItemEntity getProductItem();

	/**
	 * SAVES AND RETURNS THE PRODUCT ITEM.
	 *
	 * @return {@code ProductItem} savedProductItem
	 *
	 */
	boolean saveProductItem();

	/**
	 * UPDATES AND RETURNS THE PRODUCT ITEM.
	 *
	 * @return {@code ProductItem} updatedProductItem
	 *
	 */
	boolean updateProductItem();

	/**
	 * DELETES AND RETURNS IF THE PRODUCT ITEM IS DELETED.
	 *
	 * @return {@code true} if ProductItem is deleted
	 *
	 */
	boolean deleteProductItem();
}
