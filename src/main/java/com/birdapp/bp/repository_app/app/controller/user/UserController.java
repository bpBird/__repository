package com.birdapp.bp.repository_app.app.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.birdapp.bp.repository_app.app.form.user.UserForm;
import com.birdapp.bp.repository_app.domain.model.user.User;
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

	@GetMapping("user/list")
	String getUserList (Model model) {
		List<User> userList = iUserService.getUserList();
		model.addAttribute(userList);
		return "user/list";
	}

}
