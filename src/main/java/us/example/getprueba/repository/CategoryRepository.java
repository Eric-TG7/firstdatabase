package us.example.getprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.example.getprueba.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
