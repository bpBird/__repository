package com.birdapp.bp.stock_app.app.form.common;

import com.birdapp.bp.stock_app.app.form.organization.OrganizationPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserPostForm;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * USER FORM.
 *
 * @author bp
 *
 */
@RequiredArgsConstructor
@Getter
public class RegisterForm {

	private final OrganizationPostForm organizationPostForm;

	private final UserPostForm userPostForm;

	public RegisterForm() {
		this.organizationPostForm = new OrganizationPostForm();
		this.userPostForm = new UserPostForm();
	}
}
