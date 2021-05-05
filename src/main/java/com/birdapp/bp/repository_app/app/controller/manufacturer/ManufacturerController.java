package com.birdapp.bp.repository_app.app.controller.manufacturer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.manufacturer.ManufacturerForm;
import com.birdapp.bp.repository_app.domain.model.manufacturer.Manufacturer;
import com.birdapp.bp.repository_app.domain.service.manufacturer.IManufacturerService;

/**
 * CONTROLLER FOR MANUFACTURER.
 *
 * @author bp
 *
 */
@Controller
public class ManufacturerController<F extends ManufacturerForm> {

	@Autowired
	IManufacturerService iManufacturerService;

	@GetMapping("/manufacturer/list")
	public String getManufacturerList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<Manufacturer> manufacturerList = iManufacturerService.getManufacturerList();
		model.addAttribute(manufacturerList);
		return "manufacturer/list";
	}

	@GetMapping("/manufacturer/edit-modal")
	String editManufacturer (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "manufacturer/edit";
	}
}
