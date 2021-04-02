package com.birdapp.bp.repository_app.domain.model.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * PRODUCT ITEM DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "product_items")
@Getter
@Setter
public class ProductItem extends BaseEntity{

    /** NAME. */
    @Column(name = "NAME")
    private String name;

    /** CATEGORY ID. */
    @ManyToOne
    @JoinColumn(name = "PRODUCT_CATEGORIES_ID")
    private Long productCategoryId;

    /** MANUFACTURER ID. */
    @ManyToOne
    @JoinColumn(name = "MANUFACTURER_ID")
    private Long manufacturerId;

    /** BUYING PRICE. */
    @Column(name = "BUYING_PRICE")
    private BigDecimal buyingPrice;

    /** SELLING PRICE. */
    @Column(name = "SELLING_PRICE")
    private BigDecimal sellingPrice;

    /** INHOUSE STOCK. */
    @Column(name = "INHOUSE_STOCK")
    private int inhouseStock;

    /** ARRIVING STOCK. */
    @Column(name = "ARRIVING_STOCK")
    private int arrivingStock;
}