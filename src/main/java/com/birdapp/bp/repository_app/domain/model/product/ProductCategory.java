package com.birdapp.bp.repository_app.domain.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * PRODUCT CATEGORY DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "product_categories")
@Getter
@Setter
public class ProductCategory extends AbstractEntity{

    /** NAME. */
    @Column(name = "NAME")
    private String name;
}