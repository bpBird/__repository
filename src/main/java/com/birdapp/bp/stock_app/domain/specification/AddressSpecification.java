package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.entity.AddressField;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR ADDRESS.
 *
 * @author bp
 *
 */
public interface AddressSpecification<T extends AddressField> {

	default Specification<T> hasCountry(String country) {
		return StringUtils.isEmpty(country) ? null : (root, query, cb) -> {
			return cb.equal(root.get("country"), country);
		};
	}

	default Specification<T> hasState(String state) {
		return StringUtils.isEmpty(state) ? null : (root, query, cb) -> {
			return cb.equal(root.get("state"), state);
		};
	}

	default Specification<T> hasPrefecture(String prefecture) {
		return StringUtils.isEmpty(prefecture) ? null : (root, query, cb) -> {
			return cb.equal(root.get("prefecture"), prefecture);
		};
	}

}
