package com.birdapp.bp.repository_app.domain.model.order;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * ORDERED ITEM DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "order_items")
@Getter
@Setter
public class OrderItem extends BaseEntity{

    /** ORDER ID. */
    @OneToOne(mappedBy = "orders", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "orders_id")
    private Long orderId;

    /** PRODUCT ID. */
    @ManyToOne
    @JoinColumn(name = "product_items_id")
    private Long productItemId;

    /** QUANTITY. */
    @Column(name = "QUANTITY")
    private int quantity;

    /** TOTAL PRICE. */
    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;
}