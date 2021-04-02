package com.birdapp.bp.repository_app.domain.specification.manufacturer;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;

public class ManufacturerStaffSpecification {

	public Specification<ManufacturerStaff> containsName(String name) {
//		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
//			return cb.like(root.get("name"), "%" + name + "%");
//		};
	}

	public Specification<ManufacturerStaff> hasPhoneNumber(String phoneNumber) {
		return StringUtils.isEmpty(phoneNumber) ? null : (root, query, cb) -> {
			return cb.equal(root.get("phoneNumber"), phoneNumber);
		};
	}

	public Specification<ManufacturerStaff> hasEmail(String email) {
		return StringUtils.isEmpty(email) ? null : (root, query, cb) -> {
			return cb.equal(root.get("email"), email);
		};
	}

	public Specification<ManufacturerStaff> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturer"), manufacturerId);
		};
	}
}
