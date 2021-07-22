package com.birdapp.bp.stock_app.domain.repository.user;

import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

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
		extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

	/**
	 * find {@link UserEntity} by organization id.
	 */
	public List<UserEntity> findByOrganizationId(Long organizationId);
	
	/**
	 * find {@link UserEntity} by username.
	 */
	public UserEntity findByUsername(String username);

}