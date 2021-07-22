package com.birdapp.bp.stock_app.domain.helper.user;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDto;

/**
 * USER SERVICE HELPER INTERFACE.
 *
 * @author bp
 *
 */
public interface UserServiceHelper {

    public List<UserDto> getUserDtos(final Long organizationId);

    public List<UserDto> getUserDtosInSearch(final Long organizationId, UserSearchForm userSearchForm);

    public UserDetailDto getUserDetailDto(final Long userId);

    public UserDetailDto saveUser(final UserPostForm userPostForm);

    public Boolean deleteUser(final Long userId);


}
