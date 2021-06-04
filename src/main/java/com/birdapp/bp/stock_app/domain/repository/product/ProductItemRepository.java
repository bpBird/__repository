package com.birdapp.bp.stock_app.domain.repository.product;

import com.birdapp.bp.stock_app.domain.model.product.ProductItem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * PRODUCT ITEM REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ProductItemRepository
		extends JpaRepository<ProductItem, Long>, JpaSpecificationExecutor<ProductItem> {

	public Page<ProductItem> findAll(Specification<ProductItem> specification, Pageable pageable);
}