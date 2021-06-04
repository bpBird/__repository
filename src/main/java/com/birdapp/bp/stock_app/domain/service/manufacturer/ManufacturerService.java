package com.birdapp.bp.stock_app.domain.service.manufacturer;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.model.manufacturer.Manufacturer;

import org.springframework.stereotype.Service;

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
	public Manufacturer saveManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Manufacturer updateManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
