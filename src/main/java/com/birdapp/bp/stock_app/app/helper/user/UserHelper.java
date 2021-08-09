package com.birdapp.bp.stock_app.app.helper.user;

import java.util.Optional;

import com.birdapp.bp.stock_app.app.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.app.dto.user.UserListDto;
import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;

/**
 * USER HELPER.
 *
 * @author bp
 *
 */
public interface UserHelper {

	UserListDto getUserListDto(final Long organizationId);

	UserListDto getUserListDtoInSearch(final UserSearchForm userSearchForm);

	UserDetailDto getUserDetailDto(final Long organizationId, final Long userId);

	UserPostForm getUserPostForm(final Long organizationId, final Long userId);

	Boolean isUniqueEmail(final String email);

	UserDetailDto saveUser(final UserPostForm userPostForm);

	void deleteUser(final Long userId);

}
