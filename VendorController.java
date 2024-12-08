package com.java.Coursework01.controller;

import com.java.Coursework01.model.Vendor;
import com.java.Coursework01.service.VendorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping
    public void addVendor(@RequestBody Vendor vendor) {
        vendorService.saveVendor(vendor);
    }
}
