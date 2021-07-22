package com.birdapp.bp.stock_app.domain.constant.field;

import org.springframework.security.core.GrantedAuthority;

/**
 * USER AUTHORITY.
 *
 * @author bp
 *
 */
public enum UserAuthority implements GrantedAuthority{

    ADMIN("Admin"),

    USER("User");

    private String value;

    UserAuthority(String value){
        this.value = value;
    }

    @Override
    public String getAuthority() {
        return this.value;
    }

}