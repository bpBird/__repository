package com.birdapp.bp.stock_app.domain.service.user;

import java.util.List;

import com.birdapp.bp.stock_app.domain.model.user.User;

/**
 * USER SERVICE INTERFACE.
 *
 * @author bp
 *
 */
public interface IUserService {

	/**
	 * RETURNS THE USER LIST.
	 *
	 * @return {@code ArrayList} userList
	 *
	 */
	List<User> getUserList();

	/**
	 * RETURNS THE USER.
	 *
	 * @return {@code User} user
	 *
	 */
	User getUser();

	/**
	 * SAVES AND RETURNS THE USER.
	 *
	 * @return {@code User} savedUser
	 *
	 */
	User saveUser();

	/**
	 * UPDATES AND RETURNS THE USER.
	 *
	 * @return {@code User} updatedUser
	 *
	 */
	User updateUser();

	/**
	 * DELETES AND RETURNS IF THE USER IS DELETED.
	 *
	 * @return {@code true} if User is deleted
	 *
	 */
	Boolean deleteUser();

}
