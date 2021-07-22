package com.birdapp.bp.stock_app.domain.service.user;

import javax.transaction.Transactional;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.helper.user.UserServiceHelper;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserListDto;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * USER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserServiceHelper userServiceHelper;

	@Override
	public UserListDto getUserListDto(final Long organizationId) {
		UserListDto userListDto = new UserListDto();
        userListDto.setUserList(userServiceHelper.getUserDtos(organizationId));
        return userListDto;
	}

	@Override
	public UserListDto getUserListDtoInSearch(Long organizationId, UserSearchForm userSearchForm) {
		UserListDto userListDto = new UserListDto();
		userListDto.setUserList(userServiceHelper.getUserDtosInSearch(organizationId, userSearchForm));
		return userListDto;
	}

	@Override
	public UserDetailDto getUserDetailDto(Long userId) {
		return userServiceHelper.getUserDetailDto(userId);
	}

	@Override
	public UserDetailDto saveUser(UserPostForm userPostForm) {
		return userServiceHelper.saveUser(userPostForm);
	}

	@Override
	public Boolean deleteUser(Long userId) {
		return userServiceHelper.deleteUser(userId);
	}
}
