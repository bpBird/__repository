package com.birdapp.bp.repository_app.app.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.user.UserForm;
import com.birdapp.bp.repository_app.domain.service.user.IUserService;

/**
 * CONTROLLER FOR USERS.
 *
 * @author bp
 *
 */
@Controller
public class UserController<F extends UserForm> {

	@Autowired
	IUserService iUserService;

	@GetMapping("/user/list")
	String getUserList (Model model) {
		//TODO get the searching requirements and return list view (no-param means all)
//		List<User> userList = iUserService.getUserList();
//		model.addAttribute(userList);
		return "user/list";
	}

	@GetMapping("/user/edit-modal")
	String editUser (Model model) {
		//TODO get the target object id and return edit view(modal window w/ form)
		return "user/edit";
	}
}
