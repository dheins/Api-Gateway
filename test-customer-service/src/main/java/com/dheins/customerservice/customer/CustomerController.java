package com.dheins.customerservice.customer;

import com.dheins.customerservice.customer.model.CreateCustomerRequest;
import com.dheins.customerservice.customer.model.CreateCustomerResponse;
import com.dheins.customerservice.customer.model.Customer;
import com.dheins.customerservice.customer.model.GetCustomerResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/")
    public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest request) {
        return new CreateCustomerResponse(
                true,
                String.format("Successfully created customer id %s", request.id())
        );
    }

    @GetMapping("/{id}")
    public GetCustomerResponse getCustomer(@PathVariable String id){
        return new GetCustomerResponse(true, "",
                new Customer(id, "Acme corp", "123 main st, anywhere, IL"));
    }
}
