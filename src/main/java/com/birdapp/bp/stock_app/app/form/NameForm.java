package com.birdapp.bp.stock_app.app.form;

/**
 * NAME FORM INTERFACE.
 *
 * @author bp
 *
 */
public interface NameForm {

	/**
	 * FIRSTNAME.
	 *  
	 * <pre>
	 * should be
	 * 	{@code @Size(max = 100)}
	 * </pre>
	 * 
	 * @return firstname
	 */
    public String getFirstname();

	/**
	 * LASTNAME.
	 *  
	 * <pre>
	 * should be
	 * 	{@code @Size(max = 100)}
	 * </pre>
	 * 
	 * @return lastname
	 */
    public String getLastname();

}
