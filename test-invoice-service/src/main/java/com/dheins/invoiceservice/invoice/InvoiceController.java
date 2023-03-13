package com.dheins.invoiceservice.invoice;

import com.dheins.invoiceservice.invoice.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @PostMapping("/")
    public ResponseEntity<CreateInvoiceResponse> createInvoice(@RequestBody CreateInvoiceRequest request) {
        return new ResponseEntity<>(new CreateInvoiceResponse(
                true,
                String.format("Invoice %s created successfully.", request.invoiceNumber())),
                HttpStatus.OK);
    }

    @GetMapping("/{invoice_number}")
    public ResponseEntity<GetInvoiceResponse> getInvoice(@PathVariable("invoice_number") String invoiceNumber) {
        return new ResponseEntity<>(new GetInvoiceResponse(
                true,
                "",
                new Invoice(
                        "Acme_0001",
                        invoiceNumber,
                        LocalDate.of(2023,3,1),
                        BigDecimal.valueOf(550.36),
                        new Terms("NET30", 30, false),
                        LocalDate.of(2023,3,31))),
                HttpStatus.OK);
    }
}
