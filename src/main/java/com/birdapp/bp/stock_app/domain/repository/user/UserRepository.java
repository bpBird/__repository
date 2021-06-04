package com.birdapp.bp.stock_app.domain.repository.user;

import com.birdapp.bp.stock_app.domain.model.user.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

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