package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Supplier;
import us.example.getprueba.repository.CategoryRepository;
import us.example.getprueba.repository.SupplierRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public void saveCategoryRepository( Category category) {
        categoryRepository.save(category);
    }
}
