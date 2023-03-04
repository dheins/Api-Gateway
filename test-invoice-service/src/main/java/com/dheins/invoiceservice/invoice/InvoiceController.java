package com.dheins.invoiceservice.invoice;

import com.dheins.invoiceservice.invoice.model.*;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @PostMapping("/")
    public CreateInvoiceResponse createInvoice(@RequestBody CreateInvoiceRequest request) {
        return new CreateInvoiceResponse(
                true,
                String.format("Invoice %s created successfully.", request.invoiceNumber()));
    }

    @GetMapping("/{invoice_number}")
    public GetInvoiceResponse getInvoice(@PathVariable("invoice_number") String invoiceNumber) {
        return new GetInvoiceResponse(
                true,
                "",
                new Invoice(
                        "Acme_0001",
                        invoiceNumber,
                        LocalDate.of(2023,3,1),
                        BigDecimal.valueOf(550.36),
                        new Terms("NET30", 30, false),
                        LocalDate.of(2023,3,31)));
    }
}
