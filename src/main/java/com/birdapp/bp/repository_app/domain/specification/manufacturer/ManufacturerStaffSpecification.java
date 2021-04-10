package com.birdapp.bp.repository_app.domain.specification.manufacturer;

import org.springframework.data.jpa.domain.Specification;

import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;
import com.birdapp.bp.repository_app.domain.specification.ContactSpecification;

public class ManufacturerStaffSpecification extends ContactSpecification<ManufacturerStaff> {

	public Specification<ManufacturerStaff> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}
}
