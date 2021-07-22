package com.birdapp.bp.stock_app.app.form;

import java.io.Serializable;

/**
 * ABSTRACT FORM (abstract form).
 *
 * @author bp
 *
 */
public interface BaseForm extends Serializable {

	/**
	 * ID.
	 *  
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return id
	 */
	public Long getId();

}
