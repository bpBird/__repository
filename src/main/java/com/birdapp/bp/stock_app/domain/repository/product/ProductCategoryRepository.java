package com.birdapp.bp.stock_app.domain.repository.product;

import com.birdapp.bp.stock_app.domain.model.product.ProductCategory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * PRODUCT CATEGORY REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ProductCategoryRepository
		extends JpaRepository<ProductCategory, Long>, JpaSpecificationExecutor<ProductCategory> {

	public Page<ProductCategory> findAll(Specification<ProductCategory> specification, Pageable pageable);
}