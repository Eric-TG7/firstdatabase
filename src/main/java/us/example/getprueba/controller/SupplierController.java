package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Supplier;
import us.example.getprueba.service.SupplierService;

@RestController
@RequestMapping("/api")
public class SupplierController {


    @Autowired
private SupplierService supplierService;
    @PostMapping("/supplier")
    public void saveSupplierRepository(@RequestBody Supplier supplier){
supplierService.saveSupplierRepository(supplier);
}




}
