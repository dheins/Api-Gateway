package com.dheins.customerservice.customer.model;

public record CreateCustomerRequest(
        String id,
        String name,
        String address
) {}
