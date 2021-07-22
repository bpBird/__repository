package com.birdapp.bp.stock_app.app.controller.user;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.constant.path.user.UserUrl;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserListDto;
import com.birdapp.bp.stock_app.domain.service.user.UserService;

import org.springframework.context.MessageSource;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

/**
 * CONTROLLER FOR USER PAGE.
 *
 * @author bp
 *
 */
@RequiredArgsConstructor
@Controller
public class UserController<UPF, USF extends UserForm> implements UserUrl {

	private final UserService userService;

	private final MessageSource messageSource;

	@GetMapping(USER_LIST)
	String getUserListView (@AuthenticationPrincipal UserDetailDto userDetailDto,
							Model model) {
		UserListDto userList = userService.getUserListDto(userDetailDto.getOrganizationId());
		model.addAttribute(userList);
		return "user/list";
	}

	@ResponseBody
	@GetMapping(USER_MODAL_SEARCH)
	UserListDto getUserListInSearch (@Validated UserSearchForm userSearchForm,
							   		 @AuthenticationPrincipal UserDetailDto userDetailDto,
							   		 Model model) {
		return userService.getUserListDtoInSearch(userDetailDto.getOrganizationId(), userSearchForm);
	}

	@ResponseBody
	@RequestMapping(USER_MODAL_DETAIL)
	UserDetailDto getUserDetail (@PathVariable("userId") Long userId) {
		return userService.getUserDetailDto(userId);
	}

	@PostMapping(USER_MODAL_SAVE)
	String postUserSave(@Validated UserPostForm userPostForm,
						@AuthenticationPrincipal UserDetailDto userDetailDto,
						RedirectAttributes redirectAttributes,
						Model model) {
		userService.saveUser(userPostForm);
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("user.save.success", new String[]{}, userDetailDto.getLocale()));
        return REDIRECT_TO + USER_LIST;
	}

	@DeleteMapping(USER_MODAL_DELETE)
	String postUserDelete(@PathVariable("userId") Long userId,
						   @AuthenticationPrincipal UserDetailDto userDetailDto,
						   RedirectAttributes redirectAttributes,
						   Model model) {
		userService.deleteUser(userId);
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("user.save.success", new String[]{}, userDetailDto.getLocale()));
		return REDIRECT_TO + USER_LIST;
	}
	
}
