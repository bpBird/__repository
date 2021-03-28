package com.birdapp.bp.repository_app.domain.service.manufacturer;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.manufacturer.Manufacturer;

/**
 * MANUFACTURER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IManufacturerService {

	List<Manufacturer> getManufacturerList();

	Manufacturer getManufacturer();

	boolean registerManufacturer();

	boolean updateManufacturer();

	boolean deleteManufacturer();

}
