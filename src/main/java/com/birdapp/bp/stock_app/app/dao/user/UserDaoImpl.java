package com.birdapp.bp.stock_app.app.dao.user;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.app.specification.user.UserSpecification;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.repository.user.UserRepository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * USER DAO.
 *
 * @author bp
 *
 */
@Component
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    private final UserSpecification userSpecification;

    @Override
    public List<UserEntity> getUserEntities(final Long organizationId) {
        return userRepository.findAllByOrganizationId(organizationId);
    }

    @Override
    public List<UserEntity> getUserEntitiesInSearch(final UserSearchForm userSearchForm) {
        return userRepository.findAll(createSpecification(userSearchForm));
    }

    private Specification<UserEntity> createSpecification(UserSearchForm userSearchForm) {
        return Specification
                .where(userSpecification.hasOrganizationId(userSearchForm.getOrganizationId()))
                .and(userSpecification.nameContains(userSearchForm.getName()))
                .and(userSpecification.emailContains(userSearchForm.getEmail()))
                .and(userSpecification.phoneNumberContains(userSearchForm.getPhoneNumber()))
                .and(userSpecification.hasAuthority(userSearchForm.getAuthority()));
    } 

    @Override
    public Optional<UserEntity> findByUsername(final String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<UserEntity> getUserEntity(final Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Boolean existsEmail(final String email) {
        return userRepository.existsByEmail(email);
    }

}
