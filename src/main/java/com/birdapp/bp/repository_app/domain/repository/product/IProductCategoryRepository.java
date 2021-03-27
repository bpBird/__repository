package com.birdapp.bp.repository_app.domain.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.product.ProductCategory;

/**
 * PRODUCT CATEGORY REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}