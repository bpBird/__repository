package com.birdapp.bp.stock_app.domain.specification;

import java.time.LocalDateTime;

import com.birdapp.bp.stock_app.domain.model.CoreEntity;

import org.springframework.data.jpa.domain.Specification;

public abstract class CoreSpecification <T extends CoreEntity>{

	public Specification<T> hasId(Long id) {
		return id == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("id"), id);
		};
	}

	public Specification<T> isCreatedBy(Long userId) {
		return userId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("createdBy"), userId);
		};
	}

	public Specification<T> fromToCreationDate(LocalDateTime startingDate, LocalDateTime endDate) {
		return startingDate == null && endDate == null ? null : (root, query, cb) -> {
			return cb.between(root.get("createdAt"), startingDate, endDate);
		};
	}

	public Specification<T> isUpdatedBy(Long userId) {
		return userId == null ? null : (root, query, cb) -> {
			return cb.equal(root.get("updatedBy"), userId);
		};
	}

	public Specification<T> fromToUpdateDate(LocalDateTime startingDate, LocalDateTime endDate) {
		return startingDate == null && endDate == null ? null : (root, query, cb) -> {
			return cb.between(root.get("updatedAt"), startingDate, endDate);
		};
	}
}
