package com.birdapp.bp.repository_app.domain.repository.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
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

	public Page<User> findAll(Specification<User> specification, Pageable pageable);
}