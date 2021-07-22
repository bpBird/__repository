package com.birdapp.bp.stock_app.app.controller;

import com.birdapp.bp.stock_app.app.form.RegisterForm;
import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.domain.constant.path.UtilUrl;
import com.birdapp.bp.stock_app.domain.service.user.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

/**
 * CONTROLLER FOR ENTRY POINT.
 *
 * @author bp
 *
 */
@RequiredArgsConstructor
@Controller
public class RegistrationController implements CommonUrl {

	private final OrganizationService organizationService;

	private final UserService userService;
    
    @GetMapping("/register")
	String getRegisterView (Model model) {
		return "register";
	}

    @PostMapping("/sign_up")
	String postRegisterForm(@Validated RegisterForm registerForm,
						RedirectAttributes redirectAttributes,
						Model model) {
        organizationService.saveOrganization(new OrganizationPostForm(registerForm));
		userService.saveUser(new UserPostForm(registerForm));
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("organization.save.success", new String[]{}, userDetailDto.getLocale()));
        return REDIRECT_TO + LOGIN;
	}
}
