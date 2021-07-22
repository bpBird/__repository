package com.birdapp.bp.stock_app.domain.model.dao.user;

import java.util.List;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDto;

/**
 * USER DAO.
 *
 * @author bp
 *
 */
public interface UserDao {

    public List<UserEntity> getUserEntities(final Long organizationId);

    public List<UserEntity> getUserEntitiesInSearch(final Long organizationId, final UserSearchForm userSearchForm);

    // TODO move this method.
    public UserEntity findByUsername(final String username);

    public UserEntity getUserEntity(final Long userId);

    public UserEntity saveUserEntity(final UserPostForm userPostForm);

    public Boolean deleteUserEntity(final Long userId);

}
