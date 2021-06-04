package com.birdapp.bp.stock_app.domain.specification;

import com.birdapp.bp.stock_app.domain.model.AddressEntity;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

/**
 * SPECIFICATION FOR ADDRESS.
 *
 * @author bp
 *
 */
public abstract class AddressSpecification<T> extends ContactSpecification<AddressEntity> {

	public Specification<T> hasCountry(String country) {
		return StringUtils.isEmpty(country) ? null : (root, query, cb) -> {
			return cb.equal(root.get("country"), country);
		};
	}

	public Specification<T> hasState(String state) {
		return StringUtils.isEmpty(state) ? null : (root, query, cb) -> {
			return cb.equal(root.get("state"), state);
		};
	}

	public Specification<T> hasPrefecture(String prefecture) {
		return StringUtils.isEmpty(prefecture) ? null : (root, query, cb) -> {
			return cb.equal(root.get("prefecture"), prefecture);
		};
	}

}
