package com.java.Coursework01.controller;

import com.java.Coursework01.model.Customer;
import com.java.Coursework01.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }
}
