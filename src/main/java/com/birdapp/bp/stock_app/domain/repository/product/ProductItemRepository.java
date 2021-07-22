package com.birdapp.bp.stock_app.domain.repository.product;

import com.birdapp.bp.stock_app.domain.entity.product.ProductItemEntity;

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
		extends JpaRepository<ProductItemEntity, Long>, JpaSpecificationExecutor<ProductItemEntity> {

	public Page<ProductItemEntity> findAll(Specification<ProductItemEntity> specification, Pageable pageable);
}