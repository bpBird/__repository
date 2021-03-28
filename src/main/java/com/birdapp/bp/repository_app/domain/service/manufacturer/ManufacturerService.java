package com.birdapp.bp.repository_app.domain.service.manufacturer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.manufacturer.Manufacturer;

/**
 * MANUFACTURER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ManufacturerService implements IManufacturerService {

	@Override
	public List<Manufacturer> getManufacturerList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Manufacturer getManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean registerManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
