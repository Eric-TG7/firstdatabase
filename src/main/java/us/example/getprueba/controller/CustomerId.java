package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerId {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/customer")
    public void saveCustomerRepository(@RequestBody Customer customer){
        customerService.saveCustomerRepository(customer);
    }
}
