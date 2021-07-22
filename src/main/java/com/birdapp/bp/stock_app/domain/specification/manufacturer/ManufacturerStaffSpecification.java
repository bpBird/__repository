package com.birdapp.bp.stock_app.domain.specification.manufacturer;

import com.birdapp.bp.stock_app.domain.entity.ContactField;
import com.birdapp.bp.stock_app.domain.entity.NameField;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerStaffEntity;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;
import com.birdapp.bp.stock_app.domain.specification.NameSpecification;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

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
