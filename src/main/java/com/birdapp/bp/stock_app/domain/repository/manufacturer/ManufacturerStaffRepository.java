package com.birdapp.bp.stock_app.domain.repository.manufacturer;

import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerStaffEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * MANUFACTURER STAFF REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ManufacturerStaffRepository
		extends JpaRepository<ManufacturerStaffEntity, Long>, JpaSpecificationExecutor<ManufacturerStaffEntity> {

	public Page<ManufacturerStaffEntity> findAll(Specification<ManufacturerStaffEntity> specification, Pageable pageable);
}