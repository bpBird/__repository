package com.birdapp.bp.stock_app.domain.model.dto.user;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

import lombok.Getter;

/**
 * USER DTO.
 *
 * @author bp
 *
 */
@Getter
public class UserDto {

    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private UserAuthority authority;

    public UserDto() {
    }

    public UserDto(UserEntity user) {
        this.id = user.getId();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.email = user.getEmail();
        this.authority = user.getAuthority();
    }

}