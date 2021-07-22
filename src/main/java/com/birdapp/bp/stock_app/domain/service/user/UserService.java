package com.birdapp.bp.stock_app.domain.service.user;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserListDto;

/**
 * USER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface UserService {

	UserListDto getUserListDto(final Long organizationId);

	UserListDto getUserListDtoInSearch(final Long organizationId, final UserSearchForm userSearchForm);

	UserDetailDto getUserDetailDto(final Long userId);

	UserDetailDto saveUser(final UserPostForm userPostForm);

	Boolean deleteUser(final Long userId);

}
