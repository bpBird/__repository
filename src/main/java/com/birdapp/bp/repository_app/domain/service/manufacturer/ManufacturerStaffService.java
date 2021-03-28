package com.birdapp.bp.repository_app.domain.service.manufacturer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;

/**
 * MANUFACTURER STAFF IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class ManufacturerStaffService implements IManufacturerStaffService {

	@Override
	public List<ManufacturerStaff> getManufacturerStaffList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ManufacturerStaff getManufacturerStaff() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean registerManufacturerStaff() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateManufacturerStaff() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteManufacturerStaff() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
