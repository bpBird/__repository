package com.birdapp.bp.repository_app.domain.repository.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birdapp.bp.repository_app.domain.model.manufacturer.Manufacturer;

/**
 * MANUFACTURER REPOSITORY INTERFACE.
 *
 * @author bp
 *
 */
@Repository
public interface IManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
