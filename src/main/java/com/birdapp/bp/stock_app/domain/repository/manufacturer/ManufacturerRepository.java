package com.birdapp.bp.stock_app.domain.repository.manufacturer;

import com.birdapp.bp.stock_app.domain.entity.manufacturer.ManufacturerEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * MANUFACTURER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ManufacturerRepository
		extends JpaRepository<ManufacturerEntity, Long>, JpaSpecificationExecutor<ManufacturerEntity> {

	public Page<ManufacturerEntity> findAll(Specification<ManufacturerEntity> specification, Pageable pageable);
}
