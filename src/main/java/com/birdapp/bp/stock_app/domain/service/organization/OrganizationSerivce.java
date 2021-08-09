package com.birdapp.bp.stock_app.domain.service.organization;

import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

/**
 * ORGANIZATION SERVICE.
 *
 * @author bp
 *
 */
public interface OrganizationSerivce {

    OrganizationEntity saveOrganization(final OrganizationEntity organizationEntity);
}
