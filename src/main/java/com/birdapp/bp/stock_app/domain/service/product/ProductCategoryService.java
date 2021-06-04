package com.birdapp.bp.stock_app.domain.service.product;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.model.product.ProductCategory;

import org.springframework.stereotype.Service;

/**
 * PRODUCT CATEGORY SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ProductCategoryService implements IProductCategoryService {

	@Override
	public List<ProductCategory> getProductCategoryList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategory getProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategory saveProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ProductCategory updateProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteProductCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
