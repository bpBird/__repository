package com.birdapp.bp.stock_app.app.helper.user;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import com.birdapp.bp.stock_app.app.dao.user.UserDao;
import com.birdapp.bp.stock_app.app.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.app.dto.user.UserDto;
import com.birdapp.bp.stock_app.app.dto.user.UserListDto;
import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.service.user.UserService;
import com.birdapp.bp.stock_app.domain.validation.EmailValidator;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import lombok.RequiredArgsConstructor;

/**
 * USER HELPER IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Component
@RequiredArgsConstructor
public class UserHelperImpl implements UserHelper {

	private final UserDao userDao;
	
	private final UserService userService;

	private final EmailValidator emailValidator;

	@Override
	public UserListDto getUserListDto(final Long organizationId) {
		return new UserListDto(createUserDtos(organizationId));
	}

	private List<UserDto> createUserDtos(final Long organizationId) {
		return userDao.getUserEntities(organizationId).stream()
						.map(UserDto::new)
						.collect(Collectors.toList());
	}

	@Override
	public UserListDto getUserListDtoInSearch(final UserSearchForm userSearchForm) {
		return new UserListDto(createUserDtosInSearch(userSearchForm));
	}

	private List<UserDto> createUserDtosInSearch(final UserSearchForm userSearchForm) {
		return userDao.getUserEntitiesInSearch(userSearchForm).stream()
						.map(UserDto::new)
						.collect(Collectors.toList());
	}

	@Override
	public UserDetailDto getUserDetailDto(final Long organizationId, final Long userId) {
		return userDao.getUserEntity(userId)
						.filter(user -> user.getOrganizationId().equals(organizationId))
						.map(UserDetailDto::new)
						.orElseThrow(() -> new NoSuchElementException());
	}

	@Override
	public UserPostForm getUserPostForm(final Long organizationId, final Long userId) {
		return userDao.getUserEntity(userId)
						.filter(user -> user.getOrganizationId().equals(organizationId))
						.map(UserPostForm::new)
						.orElseGet(UserPostForm::new);
	}

	@Override
	public Boolean isUniqueEmail(final String email) {
		return !userDao.existsEmail(email);
	}

	@Override
	public UserDetailDto saveUser(UserPostForm userPostForm) {
		UserEntity userEntity = new UserEntity(userPostForm);
		userService.saveUser(userEntity);
		return new UserDetailDto(userEntity);
	}

	@Override
	public void deleteUser(Long userId) {
		UserEntity userEntity = userDao.getUserEntity(userId).orElseThrow(() -> new NoSuchElementException());
		userService.deleteUser(userEntity);
	}


}