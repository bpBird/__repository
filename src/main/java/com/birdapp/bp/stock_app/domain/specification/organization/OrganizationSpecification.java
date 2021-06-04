package com.birdapp.bp.stock_app.domain.specification.organization;

import com.birdapp.bp.stock_app.domain.model.organization.Organization;
import com.birdapp.bp.stock_app.domain.specification.CoreSpecification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

public class OrganizationSpecification extends CoreSpecification<Organization>{

	public Specification<Organization> containsName(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("name"), "%" + name + "%");
		};
	}

}
