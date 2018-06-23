/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 15-May-18
 * Time: 11:42 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class ItemAdjustmentModel {
    public Integer productID;
    public Integer productCategoryID;
    public Integer productTypeID;
    public String code;
    public String description;
    public Double quantityAtHand;
    public Double currentStockValue;
    public Integer adjustmentReferenceTypeID;
    public Integer adjustmentMethod;
    public Double adjustmentQuantity;
    public Double newStockValue;

}