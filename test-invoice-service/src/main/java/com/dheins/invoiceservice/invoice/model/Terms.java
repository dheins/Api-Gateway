package com.dheins.invoiceservice.invoice.model;

public record Terms (
    String description,
    int days,
    boolean isEndOfMonth
){
}
