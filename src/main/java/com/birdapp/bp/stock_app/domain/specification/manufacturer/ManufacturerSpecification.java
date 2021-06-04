package com.birdapp.bp.stock_app.domain.specification.manufacturer;

import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.stock_app.domain.specification.AddressSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

public class ManufacturerSpecification extends AddressSpecification<Manufacturer>{

	public Specification<Manufacturer> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("lastname"), "%" + name + "%");
		};
	}
}
