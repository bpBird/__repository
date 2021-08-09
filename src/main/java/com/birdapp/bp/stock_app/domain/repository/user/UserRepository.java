package com.birdapp.bp.stock_app.domain.repository.user;

import java.util.List;
import java.util.Optional;

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

	public List<UserEntity> findAllByOrganizationId(Long organizationId);
	
	public Optional<UserEntity> findByUsername(String username);

	public Boolean existsByUsername(String username);

	public Boolean existsByEmail(String email);

}