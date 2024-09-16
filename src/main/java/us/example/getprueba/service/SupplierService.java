package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import us.example.getprueba.controller.SupplierController;
import us.example.getprueba.entity.Supplier;
import us.example.getprueba.repository.SupplierRepository;

@Service
public class SupplierService {
@Autowired
private SupplierRepository supplierRepository;


    public void saveSupplierRepository( Supplier supplier) {
supplierRepository.save(supplier);
    }
}
