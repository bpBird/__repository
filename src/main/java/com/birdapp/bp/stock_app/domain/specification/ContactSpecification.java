package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.model.ContactField;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR CONTACT.
 *
 * @author bp
 *
 */
public interface ContactSpecification<T extends ContactField> {

	default Specification<T> hasPhoneNumber(String phoneNumber) {
		return StringUtils.isEmpty(phoneNumber) ? null : (root, query, cb) -> {
			return cb.equal(root.get("phoneNumber"), phoneNumber);
		};
	}

	default Specification<T> hasEmail(String email) {
		return StringUtils.isEmpty(email) ? null : (root, query, cb) -> {
			return cb.equal(root.get("email"), email);
		};
	}
}
