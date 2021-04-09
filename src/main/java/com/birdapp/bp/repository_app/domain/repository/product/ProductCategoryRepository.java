package com.birdapp.bp.repository_app.domain.repository.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.product.ProductCategory;

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