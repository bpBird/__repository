package com.birdapp.bp.stock_app.app.controller.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.manufacturer.ManufacturerStaffPostForm;
import com.birdapp.bp.stock_app.app.helper.manufacturer.ManufacturerStaffHelper;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerStaffEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CONTROLLER FOR MANUFACTURER STAFF.
 *
 * @author bp
 *
 */
@Controller
public class ManufacturerStaffController<F extends ManufacturerStaffPostForm> {

	@Autowired
	ManufacturerStaffHelper iManufacturerStaffService;

	@GetMapping("/manufacturer/staff/list")
	public String getManufacturerStaffList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<ManufacturerStaffEntity> manufacturerStaffList = iManufacturerStaffService.getManufacturerStaffList();
		model.addAttribute(manufacturerStaffList);
		return "manufacturer/staff/list";
	}

	@GetMapping("/manufacturer/staff/edit-modal")
	String editManufacturerStaff (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "manufacturer/staff/edit";
	}
}
