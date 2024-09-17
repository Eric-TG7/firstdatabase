package us.example.getprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.example.getprueba.entity.Order;
import us.example.getprueba.entity.Supplier;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
