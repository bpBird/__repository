package com.birdapp.bp.stock_app.domain.helper.user;

import java.util.List;
import java.util.stream.Collectors;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.model.dao.user.UserDao;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDto;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * USER SERVICE HELPER IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Component
@RequiredArgsConstructor
public class UserServiceHelperImpl implements UserServiceHelper {

    private final UserDao userDao;

    @Override
    public List<UserDto> getUserDtos(final Long organizationId) {
        return userDao.getUserEntities(organizationId).stream()
                        .map(userEntity -> new UserDto(userEntity))
                        .collect(Collectors.toList());
    };

    @Override
    public List<UserDto> getUserDtosInSearch(final Long organizationId,
                                              final UserSearchForm userSearchForm) {
        return userDao.getUserEntitiesInSearch(organizationId, userSearchForm).stream()
                        .map(user -> new UserDto(user))
                        .collect(Collectors.toList());
    }

    @Override
    public UserDetailDto getUserDetailDto(final Long userId) {
        return new UserDetailDto(userDao.getUserEntity(userId));
    }

    @Override
    public UserDetailDto saveUser(final UserPostForm userPostForm) {
        return new UserDetailDto(userDao.saveUserEntity(userPostForm));
    }

    @Override
    public Boolean deleteUser(final Long userId) {
        return userDao.deleteUserEntity(userId);
    };
    
}
