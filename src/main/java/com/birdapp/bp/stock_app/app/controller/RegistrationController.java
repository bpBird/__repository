package com.birdapp.bp.stock_app.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.birdapp.bp.stock_app.app.form.common.RegisterForm;
import com.birdapp.bp.stock_app.app.helper.organization.OrganizationHelper;
import com.birdapp.bp.stock_app.app.helper.user.UserHelper;
import com.birdapp.bp.stock_app.domain.constant.path.common.EntryUrl;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import lombok.RequiredArgsConstructor;

/**
 * CONTROLLER FOR ENTRY POINT.
 *
 * @author bp
 *
 */
@RequiredArgsConstructor
@Controller
public class RegistrationController implements EntryUrl {

	private final OrganizationHelper organizationHelper;

	private final UserHelper userHelper;

	private final MessageSource messageSource;
    
    @GetMapping(PATH_TO + REGISTER)
	String getRegisterView (Model model) {
		model.addAttribute(new RegisterForm());
		return REGISTER;
	}

    @PostMapping(PATH_TO + SIGN_UP)
	RedirectView postRegisterForm(@Validated RegisterForm registerForm,
							HttpServletRequest request,
							RedirectAttributes redirectAttributes,
							Model model) {
        organizationHelper.saveOrganization(registerForm.getOrganizationPostForm());
		userHelper.saveUser(registerForm.getUserPostForm());
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("organization.success.save", new String[]{}, Locale.ENGLISH));
        return new RedirectView(PATH_TO + LOGIN);
	}

	// TODO implement ajax post script in js file. separate validation controller from this controller?
	@ResponseBody
	@PostMapping(API_EMAIL_IS_UNIQUE_VALIDATION)
	Boolean apiEmailIsUniqueValidation(String email) {
		return !userHelper.isUniqueEmail(email);
	}

}
