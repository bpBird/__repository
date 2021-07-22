package com.birdapp.bp.stock_app.domain.constant.status.order;

import lombok.Getter;

@Getter
public enum OrderStatus {

    /** NEW. */
    NEW(0),

    /** WAITING. */
    WAITING(1),

    /** WORK IN PROGRESS. */
    WORK_IN_PROGRESS(2),

    /** COMPLETED. */
    COMPLETED(3),

    /** CANCELLED. */
    CANCELLED(4);

    private int value;

	private OrderStatus(int value) {
		this.value = value;
	}
    
}