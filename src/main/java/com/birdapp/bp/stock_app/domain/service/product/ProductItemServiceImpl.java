package com.birdapp.bp.stock_app.domain.service.product;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;

import org.springframework.stereotype.Service;

/**
 * PRODUCT ITEM SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ProductItemServiceImpl implements ProductItemService {

	@Override
	public List<ProductItemEntity> getProductItemList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductItemEntity getProductItem() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean saveProductItem() {
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
