package com.birdapp.bp.stock_app.domain.model;

import java.util.Locale.IsoCountryCode;

/**
 * ADDRESS FIELDS TO IMPLEMENT.
 *
 * @author bp
 *
 */
public interface AddressField {

	public IsoCountryCode getCountry();

	public String getState();

	public String getPrefecture();

	public String getCity();

	public String getStreetAddress();

	public String getApartmentAddress();

	public String getPostalCode();

}
