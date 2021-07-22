package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.entity.ContactField;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR CONTACT.
 *
 * @author bp
 *
 */
public interface ContactSpecification<T extends ContactField> {

	default Specification<T> phoneNumberContains(String keyword) {
		return StringUtils.isEmpty(keyword) ? null : (root, query, cb) -> {
			return cb.equal(root.get("phoneNumber"), "%" + keyword + "%");
		};
	}

	default Specification<T> emailContains(String keyword) {
		return StringUtils.isEmpty(keyword) ? null : (root, query, cb) -> {
			return cb.equal(root.get("email"), "%" + keyword + "%");
		};
	}
}
