/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/23/2018
 * Time: 11:59 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.purchase;



import java.util.Objects;

public class PurchaseOrderDetailModel {

    private Integer purchaseOrderDetailID;
    private Integer purchaseOrderID;
    private Integer productID;
    private Double quantity;
    private Double unitPrice;
    private Integer UOMID;
    private Integer VATTypeID;
    private Double VAT;
    private Double discount;

    public Integer getPurchaseOrderDetailID() {
        return purchaseOrderDetailID;
    }

    public void setPurchaseOrderDetailID(Integer purchaseOrderDetailID) {
        this.purchaseOrderDetailID = purchaseOrderDetailID;
    }

    public Integer getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public void setPurchaseOrderID(Integer purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUOMID() {
        return UOMID;
    }

    public void setUOMID(Integer UOMID) {
        this.UOMID = UOMID;
    }

    public Integer getVATTypeID() {
        return VATTypeID;
    }

    public void setVATTypeID(Integer VATTypeID) {
        this.VATTypeID = VATTypeID;
    }

    public Double getVAT() {
        return VAT;
    }

    public void setVAT(Double VAT) {
        this.VAT = VAT;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseOrderDetailModel)) return false;
        if (!super.equals(o)) return false;
        PurchaseOrderDetailModel that = (PurchaseOrderDetailModel) o;
        return Objects.equals(getPurchaseOrderDetailID(), that.getPurchaseOrderDetailID()) &&
                Objects.equals(getPurchaseOrderID(), that.getPurchaseOrderID()) &&
                Objects.equals(getProductID(), that.getProductID()) &&
                Objects.equals(getQuantity(), that.getQuantity()) &&
                Objects.equals(getUnitPrice(), that.getUnitPrice()) &&
                Objects.equals(getUOMID(), that.getUOMID()) &&
                Objects.equals(getVATTypeID(), that.getVATTypeID()) &&
                Objects.equals(getVAT(), that.getVAT()) &&
                Objects.equals(getDiscount(), that.getDiscount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPurchaseOrderDetailID(), getPurchaseOrderID(), getProductID(), getQuantity(), getUnitPrice(), getUOMID(), getVATTypeID(), getVAT(), getDiscount());
    }

    @Override
    public String toString() {
        return "PurchaseOrderDetailModel{" +
                "purchaseOrderDetailID=" + purchaseOrderDetailID +
                ", purchaseOrderID=" + purchaseOrderID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", UOMID=" + UOMID +
                ", VATTypeID=" + VATTypeID +
                ", VAT=" + VAT +
                ", discount=" + discount +
                '}';
    }
}
