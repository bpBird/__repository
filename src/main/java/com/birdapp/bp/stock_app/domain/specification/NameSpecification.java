package com.birdapp.bp.stock_app.domain.specification;

import javax.persistence.criteria.Predicate;

import com.birdapp.bp.stock_app.domain.entity.NameField;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR NAME.
 *
 * @author bp
 *
 */
public interface NameSpecification<T extends NameField> {

	default Specification<T> nameContains(String keyword) {
		return StringUtils.isEmpty(keyword) ? null : (root, query, cb) -> {
			Predicate equalFirstname = cb.equal(root.get("firstname"), "%" + keyword + "%");
			Predicate equalLastname = cb.equal(root.get("lastname"), "%" + keyword + "%");
			return cb.or(equalFirstname, equalLastname);
		};
	}

}