package com.birdapp.bp.repository_app.domain.service.product;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.product.ProductItem;

/**
 * PRODUCT ITEM SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ProductItemService implements IProductItemService {

	@Override
	public List<ProductItem> getProductItemList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductItem getProductItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean registerProductItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateProductItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteProductItem() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
