package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.entity.Product;
import us.example.getprueba.repository.CustomerRepository;
import us.example.getprueba.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public void saveProductRepository( Product product) {
        productRepository.save(product);
    }
}
