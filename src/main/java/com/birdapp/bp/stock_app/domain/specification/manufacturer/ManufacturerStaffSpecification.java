package com.birdapp.bp.stock_app.domain.specification.manufacturer;

import com.birdapp.bp.stock_app.domain.model.ContactField;
import com.birdapp.bp.stock_app.domain.model.NameField;
import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.stock_app.domain.model.manufacturer.ManufacturerStaff;
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
public class ManufacturerStaffSpecification implements NameSpecification<ManufacturerStaff>,
													   ContactSpecification<ManufacturerStaff> {

    // TODO implement Specification class for ManufacturerStaff.getManufacturer().getOrganization().getId()

	public Specification<ManufacturerStaff> hasManufacturerId(Long manufacturerId) {
		return manufacturerId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("manufacturerId"), manufacturerId);
		};
	}
}
