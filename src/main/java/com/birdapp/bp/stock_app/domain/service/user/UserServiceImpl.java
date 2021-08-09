package com.birdapp.bp.stock_app.domain.service.user;

import java.util.NoSuchElementException;

import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.repository.user.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * USER SERVICE IMPLEMENTATION.
 *
 * @author bp
 *
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity saveUser(final UserEntity userEntity) {
        return userRepository.findById(userEntity.getId())
                                .map(user -> updateUser(userEntity))
                                .orElse(userRepository.save(userEntity));
    }

    private UserEntity updateUser(final UserEntity userEntity) {
        UserEntity updatingUser = userRepository.findById(userEntity.getId()).orElseThrow(() -> new NoSuchElementException());
        updatingUser.setFirstname(userEntity.getFirstname());
		updatingUser.setLastname(userEntity.getLastname());
		updatingUser.setPhoneNumber(userEntity.getPhoneNumber());
		updatingUser.setEmail(userEntity.getEmail());
		updatingUser.setUsername(userEntity.getUsername());
		updatingUser.setBcryptPassword(userEntity.getBcryptPassword());
		updatingUser.setLocale(userEntity.getLocale());
		updatingUser.setIsAccountNonLocked(userEntity.getIsAccountNonLocked());
		updatingUser.setAuthority(userEntity.getAuthority());
        return userRepository.save(updatingUser);
    }

    @Override
    public void deleteUser(final UserEntity userEntity) {
        userRepository.delete(userEntity);
    };
    
}
