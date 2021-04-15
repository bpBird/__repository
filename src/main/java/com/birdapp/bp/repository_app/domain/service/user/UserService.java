package com.birdapp.bp.repository_app.domain.service.user;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birdapp.bp.repository_app.domain.model.user.User;
import com.birdapp.bp.repository_app.domain.repository.user.UserRepository;

/**
 * USER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUserList() {
		return null;
	}

	@Override
	public User getUser() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean saveUser() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean updateUser() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
