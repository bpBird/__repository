package com.birdapp.bp.repository_app.domain.service.product;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.product.ProductItem;

/**
 * PRODUCT ITEM SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IProductItemService {

	List<ProductItem> getProductItemList();

	ProductItem getProductItem();

	boolean saveProductItem();

	boolean updateProductItem();

	boolean deleteProductItem();
}
