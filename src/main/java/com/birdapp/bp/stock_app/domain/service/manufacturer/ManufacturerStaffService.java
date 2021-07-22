package com.birdapp.bp.stock_app.domain.service.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerStaffEntity;

/**
 * MANUFACTURER STAFF SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ManufacturerStaffService {

	/**
	 * RETURNS THE MANUFACTURER STAFF LIST.
	 *
	 * @return {@code ArrayList} manufacturerStaffList
	 *
	 */
	List<ManufacturerStaffEntity> getManufacturerStaffList();

	/**
	 * RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} manufacturerStaff
	 *
	 */
	ManufacturerStaffEntity getManufacturerStaff();

	/**
	 * SAVES AND RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} savedManufacturerStaff
	 *
	 */
	ManufacturerStaffEntity saveManufacturerStaff();

	/**
	 * UPDATES AND RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} updatedManufacturerStaff
	 *
	 */
	ManufacturerStaffEntity updateManufacturerStaff();

	/**
	 * DELETES AND RETURNS IF THE MANUFACTURER STAFF IS DELETED.
	 *
	 * @return {@code true} if ManufacturerStaff is deleted
	 *
	 */
	Boolean deleteManufacturerStaff();

}
