package com.birdapp.bp.stock_app.domain.service.user;

import com.birdapp.bp.stock_app.app.dao.user.UserDao;
import com.birdapp.bp.stock_app.app.dto.user.UserDetailDto;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * USER DETAILS SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl /* implements UserDetailsService */ {

    private final UserDao userDao;

    // @Override
    // public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //     UserEntity user = userDao.findByUsername(username)
    //                                 .orElseThrow(() -> new UsernameNotFoundException("User" + username + "is not found."));
    //     return new UserDetailDto(user);
    // }

}