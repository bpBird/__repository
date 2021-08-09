package com.birdapp.bp.stock_app.app.specification.manufacturer;

import com.birdapp.bp.stock_app.app.specification.ContactSpecification;
import com.birdapp.bp.stock_app.app.specification.NameSpecification;
import com.birdapp.bp.stock_app.app.specification.OrganizationSpecification;
import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerStaffEntity;

import org.springframework.data.jpa.domain.Specification;

/**
 * SPECIFICATION FOR MANUFACTURER STAFF.
 *
 * @author bp
 *
 */
public class ManufacturerStaffSpecification implements NameSpecification<ManufacturerStaffEntity>,
													   ContactSpecification<ManufacturerStaffEntity> {

    // TODO implement Specification class for ManufacturerStaff.getManufacturer().getOrganization().getId()

	public Specification<ManufacturerStaffEntity> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}
}
