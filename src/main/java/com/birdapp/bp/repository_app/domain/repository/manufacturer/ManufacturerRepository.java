package com.birdapp.bp.repository_app.domain.repository.manufacturer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.manufacturer.Manufacturer;

/**
 * MANUFACTURER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface ManufacturerRepository
		extends JpaRepository<Manufacturer, Long>, JpaSpecificationExecutor<Manufacturer> {

	public Page<Manufacturer> findAll(Specification<Manufacturer> specification, Pageable pageable);
}
