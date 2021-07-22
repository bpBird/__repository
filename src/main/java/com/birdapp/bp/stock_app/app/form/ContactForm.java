package com.birdapp.bp.stock_app.app.form;

/**
 * CONTACT FORM INTERFACE.
 *
 * @author bp
 *
 */
public interface ContactForm {

	/**
	 * PHONE NUMBER.
	 *  
	 * <pre>
	 * should be
	 * 	{@code @Size(min = 10, max = 15)}
	 * </pre>
	 * 
	 * @return phoneNumber
	 */
	public String getPhoneNumber();

	/**
	 * EMAIL.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * 	{@code @Email}
	 * </pre>
	 * 
	 * @return email
	 */
	public String getEmail();

}
