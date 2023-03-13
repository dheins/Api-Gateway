package com.dheins.customerservice.customer;

import com.dheins.customerservice.customer.model.CreateCustomerRequest;
import com.dheins.customerservice.customer.model.CreateCustomerResponse;
import com.dheins.customerservice.customer.model.Customer;
import com.dheins.customerservice.customer.model.GetCustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/")
    public ResponseEntity<CreateCustomerResponse> createCustomer(@RequestBody CreateCustomerRequest request) {
        return new ResponseEntity<>(new CreateCustomerResponse(
                true,
                String.format("Successfully created customer id %s", request.id())),
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCustomerResponse> getCustomer(@PathVariable String id) {
        return new ResponseEntity<>(new GetCustomerResponse(true, "",
                new Customer(id, "Acme corp", "123 main st, anywhere, IL")),
                HttpStatus.OK);
    }
}
