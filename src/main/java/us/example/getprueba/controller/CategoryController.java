package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Supplier;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.SupplierService;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("/category")
    public void saveSupplierRepository(@RequestBody Category category){
        categoryService.saveCategoryRepository(category);
    }
}
