package com.akademija.snkrhead.service;

import com.akademija.snkrhead.entity.Supplier;
import com.akademija.snkrhead.repos.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = supplierRepository.findAll();
        return suppliers;
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

}
