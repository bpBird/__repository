package com.birdapp.bp.stock_app.domain.model.organization;

import lombok.Getter;

@Getter
public enum ActivateStatus {

    /** INACTIVATED. */
	INACTIVATED(0),

    /** ACTIVATED. */
	ACTIVATED(1);

	private int value;

	private ActivateStatus(int value) {
		this.value = value;
	}
    
}
