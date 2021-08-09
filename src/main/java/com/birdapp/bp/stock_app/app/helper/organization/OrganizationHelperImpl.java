package com.birdapp.bp.stock_app.app.helper.organization;

import com.birdapp.bp.stock_app.app.dto.organization.OrganizationDto;
import com.birdapp.bp.stock_app.app.form.organization.OrganizationPostForm;
import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;
import com.birdapp.bp.stock_app.domain.service.organization.OrganizationSerivce;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * ORGANIZATION HELPER IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Component
@RequiredArgsConstructor
public class OrganizationHelperImpl implements OrganizationHelper {

    private final OrganizationSerivce organizationService;

    @Override
    public OrganizationDto saveOrganization(final OrganizationPostForm organizationPostForm) {
        OrganizationEntity organizationEntity = new OrganizationEntity(organizationPostForm);
		organizationService.saveOrganization(organizationEntity);
		return new OrganizationDto(organizationEntity);
    }
    
}
