/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 28-Feb-18
 * Time: 10:25 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.models.purchase;

import java.util.Objects;

public class SupplierPaymentDetailModel {

    private Integer supplierPaymentDetailID;
    private Integer supplierPaymentID;
    private Integer supplierInvoiceID;
    private Double paidAmount;
    private Double discount;
    private Integer paymentStatus;

    public Integer getSupplierPaymentDetailID() {
        return supplierPaymentDetailID;
    }

    public void setSupplierPaymentDetailID(Integer supplierPaymentDetailID) {
        this.supplierPaymentDetailID = supplierPaymentDetailID;
    }

    public Integer getSupplierPaymentID() {
        return supplierPaymentID;
    }

    public void setSupplierPaymentID(Integer supplierPaymentID) {
        this.supplierPaymentID = supplierPaymentID;
    }

    public Integer getSupplierInvoiceID() {
        return supplierInvoiceID;
    }

    public void setSupplierInvoiceID(Integer supplierInvoiceID) {
        this.supplierInvoiceID = supplierInvoiceID;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierPaymentDetailModel)) return false;
        if (!super.equals(o)) return false;
        SupplierPaymentDetailModel that = (SupplierPaymentDetailModel) o;
        return Objects.equals(getSupplierPaymentDetailID(), that.getSupplierPaymentDetailID()) &&
                Objects.equals(getSupplierPaymentID(), that.getSupplierPaymentID()) &&
                Objects.equals(getSupplierInvoiceID(), that.getSupplierInvoiceID()) &&
                Objects.equals(getPaidAmount(), that.getPaidAmount()) &&
                Objects.equals(getDiscount(), that.getDiscount()) &&
                Objects.equals(getPaymentStatus(), that.getPaymentStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSupplierPaymentDetailID(), getSupplierPaymentID(), getSupplierInvoiceID(), getPaidAmount(), getDiscount(), getPaymentStatus());
    }

    @Override
    public String toString() {
        return "SupplierPaymentDetailModel{" +
                "supplierPaymentDetailID=" + supplierPaymentDetailID +
                ", supplierPaymentID=" + supplierPaymentID +
                ", supplierInvoiceID=" + supplierInvoiceID +
                ", paidAmount=" + paidAmount +
                ", discount=" + discount +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
