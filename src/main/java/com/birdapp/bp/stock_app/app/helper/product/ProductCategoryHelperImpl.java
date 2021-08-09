package com.birdapp.bp.stock_app.app.helper.product;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.product.ProductCategoryEntity;

import org.springframework.stereotype.Service;

/**
 * PRODUCT CATEGORY SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ProductCategoryHelperImpl implements ProductCategoryHelper {

	@Override
	public List<ProductCategoryEntity> getProductCategoryList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategoryEntity getProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategoryEntity saveProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategoryEntity updateProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
