package com.birdapp.bp.stock_app.app.form.organization;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.app.form.RegisterForm;
import com.birdapp.bp.stock_app.domain.constant.status.organization.ActivateStatus;

public class OrganizationPostForm {

    private Long id;

    @NotNull
	@Size(max = 100)
	private String name;

    @NotNull
    private ActivateStatus activateStatus;

    OrganizationPostForm() {
    }

    public OrganizationPostForm(RegisterForm registerForm) {
        this.name = registerForm.getOrganizationName();
        this.activateStatus = registerForm.getActivateStatus();
    }
}
