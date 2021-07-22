package com.birdapp.bp.stock_app.app.form;

import java.util.Locale.IsoCountryCode;

/**
 * ADDRESS FORM INTERFACE.
 *
 * @author bp
 *
 */
public interface AddressForm {

	/**
	 * COUNTRY.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return country
	 */
	public IsoCountryCode getCountry();

	/**
	 * STATE.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return state
	 */
	public String getState();

	/**
	 * PREFECTURE.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return prefecture
	 */	
	public String getPrefecture();

	/**
	 * CITY.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return city
	 */
	public String getCity();

	/**
	 * STREET ADDRESS.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return streetAddress
	 */
	public String getStreetAddress();

	/**
	 * APARTMENT ADDRESS.
	 * 
	 * @return apartmentAddress
	 */
	public String getApartmentAddress();

	/**
	 * POSTAL CODE.
	 * 
	 * <pre>
	 * should be
	 * 	{@code @NotNull}
	 * </pre>
	 * 
	 * @return postalCode
	 */
	public String getPostalCode();

}
