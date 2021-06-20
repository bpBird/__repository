package com.birdapp.bp.stock_app.domain.specification.user;

import com.birdapp.bp.stock_app.domain.model.user.User;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;
import com.birdapp.bp.stock_app.domain.specification.NameSpecification;
import com.birdapp.bp.stock_app.domain.specification.OrganizationSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR USER.
 *
 * @author bp
 *
 */
public class UserSpecification implements OrganizationSpecification<User>,
										  NameSpecification<User>,
										  ContactSpecification<User> {

	public Specification<User> hasRole(String roleName) {
		return StringUtils.isEmpty(roleName) ? null : (root, query, cb) -> {
			return cb.equal(root.get("roleName"), roleName);
		};
	}

}
