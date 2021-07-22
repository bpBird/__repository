package com.birdapp.bp.stock_app.app.controller.manufacturer;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.manufacturer.ManufacturerForm;
import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;
import com.birdapp.bp.stock_app.domain.service.manufacturer.ManufacturerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CONTROLLER FOR MANUFACTURER.
 *
 * @author bp
 *
 */
@Controller
public class ManufacturerController<F extends ManufacturerForm> {

	@Autowired
	ManufacturerService iManufacturerService;

	@GetMapping("/manufacturer/list")
	public String getManufacturerList(Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
		List<ManufacturerEntity> manufacturerList = iManufacturerService.getManufacturerList();
		model.addAttribute(manufacturerList);
		return "manufacturer/list";
	}

	@GetMapping("/manufacturer/edit-modal")
	String editManufacturer (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "manufacturer/edit";
	}
}
