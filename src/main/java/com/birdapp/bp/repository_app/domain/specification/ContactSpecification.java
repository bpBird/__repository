package com.birdapp.bp.repository_app.domain.specification;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import com.birdapp.bp.repository_app.domain.model.ContactEntity;

/**
 * SPECIFICATION FOR CONTACT.
 *
 * @author bp
 *
 */
public abstract class ContactSpecification<T> extends BaseSpecification<ContactEntity>{

	public Specification<T> hasPhoneNumber(String phoneNumber) {
		return StringUtils.isEmpty(phoneNumber) ? null : (root, query, cb) -> {
			return cb.equal(root.get("phoneNumber"), phoneNumber);
		};
	}

	public Specification<T> hasEmail(String email) {
		return StringUtils.isEmpty(email) ? null : (root, query, cb) -> {
			return cb.equal(root.get("email"), email);
		};
	}
}
