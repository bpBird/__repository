package com.birdapp.bp.stock_app.app.helper.organization;

import com.birdapp.bp.stock_app.app.dto.organization.OrganizationDto;
import com.birdapp.bp.stock_app.app.form.organization.OrganizationPostForm;

/**
 * ORGANIZATION HELPER.
 *
 * @author bp
 *
 */
public interface OrganizationHelper {

    OrganizationDto saveOrganization(final OrganizationPostForm organizationPostForm);
    
}
