package com.birdapp.bp.stock_app.domain.repository.manufacturer;

import com.birdapp.bp.stock_app.domain.model.manufacturer.ManufacturerStaff;

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
		extends JpaRepository<ManufacturerStaff, Long>, JpaSpecificationExecutor<ManufacturerStaff> {

	public Page<ManufacturerStaff> findAll(Specification<ManufacturerStaff> specification, Pageable pageable);
}