package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Order;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/order")
    public void saveOrderRepository(@RequestBody Order order){
        orderService.saveOrderRepository(order);
    }
}
