package com.birdapp.bp.stock_app.domain.service.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;

/**
 * MANUFACTURER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IManufacturerService {

	/**
	 * RETURNS THE MANUFACTURER LIST.
	 *
	 * @return {@code ArrayList} manufacturerList
	 *
	 */
	List<Manufacturer> getManufacturerList();

	/**
	 * RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	Manufacturer getManufacturer();

	/**
	 * SAVES AND RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	Manufacturer saveManufacturer();

	/**
	 * UPDATES AND RETURNS THE MANUFACTURER.
	 *
	 * @return {@code Manufacturer} manufacturer
	 *
	 */
	Manufacturer updateManufacturer();

	/**
	 * DELETES AND RETURNS IF THE MANUFACTURER IS DELETED.
	 *
	 * @return {@code true} if manufacturer is deleted
	 *
	 */
	Boolean deleteManufacturer();

}
