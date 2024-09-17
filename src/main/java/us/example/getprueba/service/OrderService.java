package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.entity.Order;
import us.example.getprueba.repository.CustomerRepository;
import us.example.getprueba.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public void saveOrderRepository( Order order) {
        orderRepository.save(order);
    }
}
