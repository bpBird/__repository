package com.birdapp.bp.stock_app.app.dto.organization;

import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

import lombok.Getter;

/**
 * ORGANIZATION DTO.
 *
 * @author bp
 *
 */
@Getter
public class OrganizationDto {
    
    private Long id;

    private String name;


    public OrganizationDto(OrganizationEntity organizationEntity) {
        this.id = organizationEntity.getId();
        this.name = organizationEntity.getName();
    }
}
