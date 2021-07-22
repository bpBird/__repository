package com.birdapp.bp.stock_app.app.form.user;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.birdapp.bp.stock_app.app.controller.user.UserForm;
import com.birdapp.bp.stock_app.app.form.OrganizationForm;
import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;

import lombok.Getter;
import lombok.Setter;

/**
 * USER SEARCH FORM.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class UserSearchForm extends UserForm implements OrganizationForm{

    @NotNull
	private Long organizationId;

	private String name;

	private String phoneNumber;

	private String email;

	@Enumerated(EnumType.STRING)
	private UserAuthority authority;

}