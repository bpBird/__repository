package com.birdapp.bp.stock_app.domain.model.dto.user;

import java.util.Collection;
import java.util.Locale;

import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * USER DETAIL DTO.
 *
 * @author bp
 *
 */
@RequiredArgsConstructor
@Getter
public class UserDetailDto implements UserDetails {
    
    private final UserDto userDto;

    private final Long organizationId; 

    private String username;

    private String password;

    private String phoneNumber;

    private Locale locale;

    private boolean isAccountNonLocked;

    public UserDetailDto(UserEntity userEntity) {
        this.userDto = new UserDto(userEntity);
        this.organizationId = userEntity.getOrganizationId();
        this.username = userEntity.getUsername();
        this.password = userEntity.getBcryptPassword();
        this.phoneNumber = userEntity.getPhoneNumber();
        this.locale = userEntity.getLocale();
        this.isAccountNonLocked = userEntity.getIsAccountNonLocked();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_" + this.userDto.getAuthority().name());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
