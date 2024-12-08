package com.java.Coursework01.service;

import com.java.Coursework01.model.Vendor;
import com.java.Coursework01.repository.VendorRepository;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    public VendorService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public void saveVendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }
}
