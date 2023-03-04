package com.dheins.invoiceservice.invoice.model;

public record GetInvoiceResponse (
        boolean ok,
        String message,
        Invoice invoice
){}
