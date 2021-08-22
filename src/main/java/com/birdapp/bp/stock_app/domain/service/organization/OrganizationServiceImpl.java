package com.birdapp.bp.stock_app.domain.service.organization;

import java.util.NoSuchElementException;

import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;
import com.birdapp.bp.stock_app.domain.repository.organization.OrganizationRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * ORGANIZATION SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationSerivce {

    private final OrganizationRepository organizationRepository;

    @Override
    public OrganizationEntity saveOrganization(final OrganizationEntity organizationEntity) {
        return organizationRepository.findById(organizationEntity.getId())
                                        .map(organization -> updateOrganization(organizationEntity))
                                        .orElse(organizationRepository.save(organizationEntity));
    }
    
    private OrganizationEntity updateOrganization(final OrganizationEntity organizationEntity) {
        OrganizationEntity updatingOrganization = organizationRepository.findById(organizationEntity.getId()).orElseThrow(() -> new NoSuchElementException());
        updatingOrganization.setName(organizationEntity.getName());
		updatingOrganization.setActivateStatus(organizationEntity.getActivateStatus());
        return organizationRepository.save(updatingOrganization);
    }
    
}
