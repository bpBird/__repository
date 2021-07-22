package com.birdapp.bp.stock_app.domain.specification.user;

import com.birdapp.bp.stock_app.domain.constant.field.UserAuthority;
import com.birdapp.bp.stock_app.domain.entity.user.UserEntity;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;
import com.birdapp.bp.stock_app.domain.specification.NameSpecification;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

/**
 * SPECIFICATION FOR USER.
 *
 * @author bp
 *
 */
@Component
public class UserSpecification implements OrganizationSpecification<UserEntity>,
										  NameSpecification<UserEntity>,
										  ContactSpecification<UserEntity> {

	public Specification<UserEntity> hasAuthority(UserAuthority authority) {
		return authority == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("userAuthority"), authority);
		};
	}

}
