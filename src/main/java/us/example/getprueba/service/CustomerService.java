package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.repository.CategoryRepository;
import us.example.getprueba.repository.CustomerRepository;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public void saveCustomerRepository( Customer customer) {
        customerRepository.save(customer);
    }

}
