package com.birdapp.bp.stock_app.domain.constant.path.manufacturer;

/**
 * INTERFACE FOR MANUFACTURER STAFF URL.
 *
 * @author bp
 *
 */
public interface ManufacturerStaffUrl {
    
    public static final String MANUFACTURER_STAFF_LIST = "/manufacturer/staff/list";

    // TODO user can change search view from manufacturer to staff with TAB.
    public static final String MANUFACTURER_STAFF_MODAL_SEARCH = "/manufacturer/staff/modal/search";

    public static final String MANUFACTURER_STAFF_MODAL_DETAIL = "/manufacturer/staff/modal/staff/detail";

    public static final String MANUFACTURER_STAFF_MODAL_EDIT = "/manufacturer/staff/modal/staff/edit";

    public static final String MANUFACTURER_STAFF_MODAL_DELETE = "/manufacturer/staff/modal/staff/delete";
}
