package com.birdapp.bp.stock_app.domain.model.manufacturer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.birdapp.bp.stock_app.domain.model.AddressEntity;
import com.birdapp.bp.stock_app.domain.model.product.ProductItem;

import lombok.Getter;
import lombok.Setter;

/**
 * MANUFACTURER ENTITY.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "MANUFACTURERS")
@Getter
@Setter
public class Manufacturer extends AddressEntity{

    /** NAME. */
    @Column(name = "NAME")
    private String name;

    /** PRODUCT ITEMS BELONG TO MANUFACTURER. */
    @OneToMany(mappedBy="manufacturer")
    @Transient
    private List<ProductItem> productItems;

}