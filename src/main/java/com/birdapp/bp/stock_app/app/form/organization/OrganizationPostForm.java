package com.birdapp.bp.stock_app.app.form.organization;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.IdForm;
import com.birdapp.bp.stock_app.domain.constant.status.organization.ActivateStatus;
import com.birdapp.bp.stock_app.domain.entity.organization.OrganizationEntity;

import lombok.Getter;

@Getter
public class OrganizationPostForm implements IdForm {

    private Long id;

    @NotNull
	@Size(max = 100)
	private String name;

    @NotNull
    private ActivateStatus activateStatus;

    public OrganizationPostForm() {
    }

    public OrganizationPostForm(OrganizationEntity organizationEntity) {
        this.name = organizationEntity.getName();
        this.activateStatus = organizationEntity.getActivateStatus();
    }
}
