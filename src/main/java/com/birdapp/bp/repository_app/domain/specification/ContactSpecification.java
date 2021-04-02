package com.birdapp.bp.repository_app.domain.specification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.Contact;

public abstract class ContactSpecification extends BaseSpecification<Contact>{

	public Specification<Contact> containsLastname(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("lastname"), "%" + name + "%");
		};
	}

	public Specification<Contact> containsFirstname(String name) {
		return StringUtils.isEmpty(name) ? null : (root, query, cb) -> {
			return cb.equal(root.get("firstname"), "%" + name + "%");
		};
	}

	public Specification<Contact> hasPhoneNumber(String phoneNumber) {
		return StringUtils.isEmpty(phoneNumber) ? null : (root, query, cb) -> {
			return cb.equal(root.get("phoneNumber"), phoneNumber);
		};
	}

	public Specification<Contact> hasEmail(String email) {
		return StringUtils.isEmpty(email) ? null : (root, query, cb) -> {
			return cb.equal(root.get("email"), email);
		};
	}
}
