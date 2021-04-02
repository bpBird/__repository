package com.birdapp.bp.repository_app.domain.repository.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.manufacturer.ManufacturerStaff;

/**
 * MANUFACTURER STAFF REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ManufacturerStaffRepository
		extends JpaRepository<ManufacturerStaff, Long>, JpaSpecificationExecutor<ManufacturerStaff> {
}