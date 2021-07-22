package com.birdapp.bp.stock_app.domain.service.user;

import java.util.ArrayList;
import java.util.List;

import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.model.dao.user.UserDao;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDetailDto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * USER DETAILS SERVICE.
 * 
 * <p>
 * find UserDetails and check the authority before login.
 * </p>
 *
 * @author bp
 *
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    // TODO rewrite with authority

    private final UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userDao.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User" + username + "is not found.");
        }

        return new UserDetailDto(user);
    }

}