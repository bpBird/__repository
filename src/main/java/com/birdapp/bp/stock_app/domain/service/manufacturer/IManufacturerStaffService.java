package com.birdapp.bp.stock_app.domain.service.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.model.manufacturer.ManufacturerStaff;

/**
 * MANUFACTURER STAFF SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IManufacturerStaffService {

	/**
	 * RETURNS THE MANUFACTURER STAFF LIST.
	 *
	 * @return {@code ArrayList} manufacturerStaffList
	 *
	 */
	List<ManufacturerStaff> getManufacturerStaffList();

	/**
	 * RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} manufacturerStaff
	 *
	 */
	ManufacturerStaff getManufacturerStaff();

	/**
	 * SAVES AND RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} savedManufacturerStaff
	 *
	 */
	ManufacturerStaff saveManufacturerStaff();

	/**
	 * UPDATES AND RETURNS THE MANUFACTURER STAFF.
	 *
	 * @return {@code ManufacturerStaff} updatedManufacturerStaff
	 *
	 */
	ManufacturerStaff updateManufacturerStaff();

	/**
	 * DELETES AND RETURNS IF THE MANUFACTURER STAFF IS DELETED.
	 *
	 * @return {@code true} if ManufacturerStaff is deleted
	 *
	 */
	Boolean deleteManufacturerStaff();

}
