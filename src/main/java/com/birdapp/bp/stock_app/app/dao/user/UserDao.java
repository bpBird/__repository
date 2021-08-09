package com.birdapp.bp.stock_app.app.dao.user;

import java.util.List;
import java.util.Optional;

import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;


/**
 * USER DAO.
 *
 * @author bp
 *
 */
public interface UserDao {

    public List<UserEntity> getUserEntities(final Long organizationId);

    public List<UserEntity> getUserEntitiesInSearch(final UserSearchForm userSearchForm);

    // TODO move this method.
    public Optional<UserEntity> findByUsername(final String username);

    public Optional<UserEntity> getUserEntity(final Long userId);

    public Boolean existsEmail(final String email);

}
