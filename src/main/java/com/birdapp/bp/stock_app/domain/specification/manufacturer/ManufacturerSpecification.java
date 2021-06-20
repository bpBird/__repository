package com.birdapp.bp.stock_app.domain.specification.manufacturer;

import com.birdapp.bp.stock_app.domain.model.AddressField;
import com.birdapp.bp.stock_app.domain.model.ContactField;
import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.stock_app.domain.specification.AddressSpecification;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR MANUFACTURER.
 *
 * @author bp
 *
 */
public class ManufacturerSpecification implements OrganizationSpecification<Manufacturer>,
												  ContactSpecification<Manufacturer>,
												  AddressSpecification<Manufacturer> {

	public Specification<Manufacturer> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("lastname"), "%" + name + "%");
		};
	}
}
