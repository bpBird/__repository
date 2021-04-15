package com.birdapp.bp.repository_app.domain.service.manufacturer;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;

/**
 * MANUFACTURER STAFF SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IManufacturerStaffService {

	List<ManufacturerStaff> getManufacturerStaffList();

	ManufacturerStaff getManufacturerStaff();

	boolean saveManufacturerStaff();

	boolean updateManufacturerStaff();

	boolean deleteManufacturerStaff();

}
