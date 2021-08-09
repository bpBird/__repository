package com.birdapp.bp.stock_app.app.specification.manufacturer;

import com.birdapp.bp.stock_app.app.specification.AddressSpecification;
import com.birdapp.bp.stock_app.app.specification.ContactSpecification;
import com.birdapp.bp.stock_app.app.specification.OrganizationSpecification;
import com.birdapp.bp.stock_app.domain.entity.AddressField;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR MANUFACTURER.
 *
 * @author bp
 *
 */
public class ManufacturerSpecification implements OrganizationSpecification<ManufacturerEntity>,
												  ContactSpecification<ManufacturerEntity>,
												  AddressSpecification<ManufacturerEntity> {

	public Specification<ManufacturerEntity> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("lastname"), "%" + name + "%");
		};
	}
}
