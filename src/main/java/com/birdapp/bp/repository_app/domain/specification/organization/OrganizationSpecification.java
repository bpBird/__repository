package com.birdapp.bp.repository_app.domain.specification.organization;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.organization.Organization;
import com.birdapp.bp.repository_app.domain.specification.CoreSpecification;

public class OrganizationSpecification extends CoreSpecification<Organization>{

	public Specification<Organization> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}

}
