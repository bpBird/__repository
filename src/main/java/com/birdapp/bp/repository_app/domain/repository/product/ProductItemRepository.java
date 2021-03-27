package com.birdapp.bp.repository_app.domain.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.product.ProductItem;

/**
 * PRODUCT ITEM REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}