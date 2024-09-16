package us.example.getprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import us.example.getprueba.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
