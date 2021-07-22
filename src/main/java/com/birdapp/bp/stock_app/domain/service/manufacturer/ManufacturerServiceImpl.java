package com.birdapp.bp.stock_app.domain.service.manufacturer;

import java.util.List;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;

import org.springframework.stereotype.Service;

/**
 * MANUFACTURER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ManufacturerServiceImpl implements ManufacturerService {

	@Override
	public List<ManufacturerEntity> getManufacturerList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ManufacturerEntity getManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ManufacturerEntity saveManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ManufacturerEntity updateManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Boolean deleteManufacturer() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
