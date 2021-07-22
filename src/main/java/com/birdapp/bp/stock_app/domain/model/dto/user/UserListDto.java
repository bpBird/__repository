package com.birdapp.bp.stock_app.domain.model.dto.user;

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

    private List<UserDto> userList;
    
}
