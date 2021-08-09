package com.birdapp.bp.stock_app.app.helper.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;

/**
 * MANUFACTURER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface ManufacturerHelper {

	/**
	 * RETURNS THE MANUFACTURER LIST.
	 *
	 * @return {@code ArrayList} manufacturerList
	 *
	 */
	List<ManufacturerEntity> getManufacturerList();

	/**
	 * RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	ManufacturerEntity getManufacturer();

	/**
	 * SAVES AND RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	ManufacturerEntity saveManufacturer();

	/**
	 * UPDATES AND RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	ManufacturerEntity updateManufacturer();

	/**
	 * DELETES AND RETURNS IF THE MANUFACTURER IS DELETED.
	 *
	 * @return {@code true} if manufacturer is deleted
	 *
	 */
	Boolean deleteManufacturer();

}
