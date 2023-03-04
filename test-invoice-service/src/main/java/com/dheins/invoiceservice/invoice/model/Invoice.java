package com.dheins.invoiceservice.invoice.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Invoice(
        String customerId,
        String invoiceNumber,
        LocalDate invoiceDate,
        BigDecimal amount,
        Terms terms,
        LocalDate dueDate
) {}
