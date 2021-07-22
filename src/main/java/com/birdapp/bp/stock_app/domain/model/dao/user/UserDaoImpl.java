package com.birdapp.bp.stock_app.domain.model.dao.user;

import java.util.List;
import java.util.NoSuchElementException;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;
import com.birdapp.bp.stock_app.app.form.user.UserSearchForm;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.model.dto.user.UserDto;
import com.birdapp.bp.stock_app.domain.repository.user.UserRepository;
import com.birdapp.bp.stock_app.domain.specification.user.UserSpecification;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.client.HttpClientErrorException.NotFound;

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
        return userRepository.findByOrganization_Id(organizationId);
    }

    @Override
    public List<UserEntity> getUserEntitiesInSearch(final Long organizationId,
                                                    final UserSearchForm userSearchForm) {
        if (userSearchForm == null) {
            return userRepository.findByOrganization_Id(organizationId);
        }
        return userRepository.findAll(Specification
                                        .where(userSpecification.hasOrganizationId(organizationId))
                                        .and(userSpecification.nameContains(userSearchForm.getName()))
                                        .and(userSpecification.emailContains(userSearchForm.getEmail()))
                                        .and(userSpecification.phoneNumberContains(userSearchForm.getPhoneNumber()))
                                        .and(userSpecification.hasAuthority(userSearchForm.getAuthority())));
    }

    @Override
    public UserEntity findByUsername(final String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserEntity getUserEntity(final Long userId) {
        return userRepository.findById(userId).orElseGet(UserEntity::new);
    }

    @Override
    public UserEntity saveUserEntity(UserPostForm userPostForm) {
        return userRepository.save(new UserEntity(userPostForm));
    }

    @Override
    public Boolean deleteUserEntity(final Long userId) {
        userRepository.delete(userRepository.findById(userId).orElseThrow(NoSuchElementException::new));
        return Boolean.TRUE;
    }

}
