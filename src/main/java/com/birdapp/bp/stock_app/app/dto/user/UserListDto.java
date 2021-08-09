package com.birdapp.bp.stock_app.app.dto.user;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * USER LIST DTO.
 *
 * @author bp
 *
 */
@Getter
@Setter
public class UserListDto {

    public List<UserDto> userDtos;

    public UserListDto(List<UserDto> userDtos) {
        this.userDtos = userDtos;
    }
    
}
