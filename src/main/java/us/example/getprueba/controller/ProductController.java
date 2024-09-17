package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Product;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/product")
    public void saveProductRepository(@RequestBody Product product){
        productService.saveProductRepository(product);
    }
}
