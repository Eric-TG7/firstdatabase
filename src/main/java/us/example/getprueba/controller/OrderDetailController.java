package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.OrderDetail;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.OrderDetailService;

@RestController
@RequestMapping("/api")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
    @PostMapping("/orderdetail")
    public void saveOrderDetailRepository(@RequestBody OrderDetail orderDetail){
        orderDetailService.saveOrderDetailRepository(orderDetail);
    }
}
