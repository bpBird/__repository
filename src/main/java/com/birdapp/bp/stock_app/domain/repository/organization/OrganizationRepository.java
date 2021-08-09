package com.birdapp.bp.stock_app.domain.repository.organization;

import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * ORGANIZATION REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface OrganizationRepository
        extends JpaRepository<OrganizationEntity, Long>, JpaSpecificationExecutor<OrganizationEntity>{
    
}
