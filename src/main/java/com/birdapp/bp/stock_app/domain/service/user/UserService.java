package com.birdapp.bp.stock_app.domain.service.user;

import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

/**
 * USER SERVICE.
 *
 * @author bp
 *
 */
public interface UserService {

    public UserEntity saveUser(final UserEntity userEntity);

    public void deleteUser(final UserEntity userEntity);

}
