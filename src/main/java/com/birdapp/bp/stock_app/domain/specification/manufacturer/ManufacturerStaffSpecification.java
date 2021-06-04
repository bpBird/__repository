package com.birdapp.bp.stock_app.domain.specification.manufacturer;

import com.birdapp.bp.stock_app.domain.model.manufacturer.ManufacturerStaff;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;

import org.springframework.data.jpa.domain.Specification;

public class ManufacturerStaffSpecification extends ContactSpecification<ManufacturerStaff> {

	public Specification<ManufacturerStaff> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}
}
