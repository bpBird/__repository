package com.birdapp.bp.repository_app.domain.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.user.User;

/**
 * USER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface UserRepository
		extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}