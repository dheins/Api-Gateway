package com.dheins.customerservice.customer.model;

public record GetCustomerResponse(
        boolean ok,
        String message,
        Customer customer
) {
}
