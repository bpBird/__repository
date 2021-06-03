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
@RequiredArgsConstructor
public class UserController<F extends UserForm> {

	private final IUserService iUserService;

	/**
	 * RETURN THE USER LIST VIEW.
	 *
	 * @param model
	 * @return userList view
	 */
	@GetMapping("/user/list")
	String getUserList (Model model) {
		// TODO get the searching requirements and return list view (method w/ no-param gets all)
		List<User> userList = iUserService.getUserList();
		model.addAttribute(userList);
		return "user/list";
	}

	/**
	 * RETURN THE REGISTER VIEW OR EDIT VIEW.
	 *
	 * @param userId
	 * @param organizationId
	 * @param model
	 * @return user
	 */
	@GetMapping("/user/modal/{userId}")
	String getUser(@PathVariable("userId") Long userId, Long organizationId ,Model model) {
		// TODO get the target object id and return info view (modal window)
		// use stream mapping and Optional object
		return "user/list";
	}

	/**
	 * RETURN USER LIST VIEW W/ SAVED MESSAGE.
	 *
	 * @param userId
	 * @param model
	 * @return userList view
	 */
	@GetMapping("/user/modal/save/{userId}")
	String saveUser(@PathVariable("userId") Long userId, Model model) {
		// TODO get the target object id and return edit view (modal window w/ form)
		// use stream mapping and Optional object
		return "user/list"; // redirect to top with success message (list view)
	}

	/**
	 * RETURN USER LIST VIEW W/ DELETED MESSAGE.
	 *
	 * @param userId
	 * @param model
	 * @return userList view
	 */
	@GetMapping("/user/modal/delete/{userId}")
	String deleteUser(@PathVariable("userId") Long userId, Model model) {
		// TODO get the target object id and return info view (modal window)
		return "user/list"; // redirect to top with success message(list view)
	}
}
