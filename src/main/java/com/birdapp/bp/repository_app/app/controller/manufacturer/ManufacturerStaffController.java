package com.birdapp.bp.repository_app.app.controller.manufacturer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.manufacturer.ManufacturerStaffForm;
import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;
import com.birdapp.bp.repository_app.domain.service.manufacturer.IManufacturerStaffService;

/**
 * CONTROLLER FOR MANUFACTURER STAFF.
 *
 * @author bp
 *
 */
@Controller
public class ManufacturerStaffController<F extends ManufacturerStaffForm> {

	@Autowired
	IManufacturerStaffService iManufacturerStaffService;

	@GetMapping("/manufacturer/staff/list")
	public String getManufacturerStaffList(Model model) {
		List<ManufacturerStaff> manufacturerStaffList = iManufacturerStaffService.getManufacturerStaffList();
		model.addAttribute(manufacturerStaffList);
		return "manufacturer/staff/list";
	}
}
