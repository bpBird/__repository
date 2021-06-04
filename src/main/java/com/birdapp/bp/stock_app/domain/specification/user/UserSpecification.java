package com.birdapp.bp.stock_app.domain.specification.user;

import com.birdapp.bp.stock_app.domain.model.user.User;
import com.birdapp.bp.stock_app.domain.specification.ContactSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

public class UserSpecification extends ContactSpecification<User> {

	public Specification<User> hasOrganizationId(Long organizationId) {
		return organizationId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("organizationId"), organizationId);
		};
	}

	public Specification<User> hasRole(String roleName) {
		return StringUtils.isEmpty(roleName) ? null : (root, query, cb) -> {
			return cb.equal(root.get("roleName"), roleName);
		};
	}
}
