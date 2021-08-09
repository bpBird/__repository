package com.birdapp.bp.stock_app.app.controller.user;

import java.util.Optional;

import com.birdapp.bp.stock_app.app.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.app.dto.user.UserListDto;
import com.birdapp.bp.stock_app.app.form.user.UserForm;
import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.app.helper.user.UserHelper;
import com.birdapp.bp.stock_app.domain.constant.path.user.UserUrl;

import org.springframework.context.MessageSource;
import org.springframework.lang.Nullable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	private final UserHelper userHelper;

	private final MessageSource messageSource;

	@GetMapping(PATH_TO + USER_LIST)
	String getUserListView (/* @AuthenticationPrincipal UserDetailDto userDetailDto, */
							Model model) {
		// UserListDto userList = userHelper.getUserListDto(userDetailDto.getOrganizationId());
		UserListDto userListDto = userHelper.getUserListDto(1L);
		model.addAttribute(userListDto);
		return USER_LIST;
	}

	@ResponseBody
	@GetMapping(PATH_TO + USER_MODAL_SEARCH)
	UserListDto getUserListInSearch (@Validated UserSearchForm userSearchForm,
							   		 @AuthenticationPrincipal UserDetailDto userDetailDto,
							   		 Model model) {
		return userHelper.getUserListDtoInSearch(userSearchForm);
	}

	@ResponseBody
	@RequestMapping(PATH_TO + USER_MODAL_DETAIL)
	UserDetailDto getUserDetail (@AuthenticationPrincipal UserDetailDto userDetailDto,
								 @RequestParam(name = "id", required = false) Long userId) {
		return userHelper.getUserDetailDto(userDetailDto.getOrganizationId(), userId);
	}

	@ResponseBody
	@RequestMapping(PATH_TO + USER_MODAL_EDIT)
	UserPostForm getUserEdit (@AuthenticationPrincipal UserDetailDto userDetailDto,
							  @RequestParam(name = "id", required = false) Long userId) {
		return userHelper.getUserPostForm(userDetailDto.getOrganizationId(), userId);
	}

	@PostMapping(PATH_TO + USER_MODAL_SAVE)
	String postUserSave(@Validated UserPostForm userPostForm,
						@AuthenticationPrincipal UserDetailDto userDetailDto,
						RedirectAttributes redirectAttributes,
						Model model) {
		userHelper.saveUser(userPostForm);
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("user.save.success", new String[]{}, userDetailDto.getLocale()));
        return REDIRECT_TO + PATH_TO + USER_LIST;
	}

	@DeleteMapping(PATH_TO + USER_MODAL_DELETE)
	String postUserDelete(@RequestParam(name = "id", required = true) Long userId,
						  @AuthenticationPrincipal UserDetailDto userDetailDto,
						  RedirectAttributes redirectAttributes,
						  Model model) {
		userHelper.deleteUser(userId);
		redirectAttributes.addFlashAttribute("message", messageSource.getMessage("user.save.success", new String[]{}, userDetailDto.getLocale()));
		return REDIRECT_TO + PATH_TO + USER_LIST;
	}
	
}
