package com.birdapp.bp.stock_app.app.form;

import java.util.Locale;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.constant.status.organization.ActivateStatus;
import com.birdapp.bp.stock_app.domain.validation.Email;

/**
 * USER FORM.
 *
 * @author bp
 *
 */
public class RegisterForm {

    @NotNull
	@Size(max = 100)
	private String organizationName;

    @NotNull
    private ActivateStatus activateStatus;

	@Size(max = 100)
	private String firstname;

	@Size(max = 100)
	private String lastname;

	@Size(min = 10, max = 15)
	private String phoneNumber;

	@NotNull
	@Email
	private String email;

	@NotNull
	@Size(min = 1, max = 100)
	private String username;

	@NotNull
	@Size(min = 60)
	private String bcryptPassword;

	@NotNull
	private Locale locale;

	@NotNull
	private Boolean isAccountNonLocked;

	@NotNull
	@Enumerated(EnumType.STRING)
	private UserAuthority authority;
    
    RegisterForm() {
    }
}
