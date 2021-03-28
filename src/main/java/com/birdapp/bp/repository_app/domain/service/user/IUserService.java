package com.birdapp.bp.repository_app.domain.service.user;

import java.util.List;

import com.birdapp.bp.repository_app.domain.model.user.User;

/**
 * USER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IUserService {

	List<User> getUserList();

	User getUser();

	boolean registerUser();

	boolean updateUser();

	boolean deleteUser();

}
