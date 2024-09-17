package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.entity.OrderDetail;
import us.example.getprueba.repository.CustomerRepository;
import us.example.getprueba.repository.OrderDetailRepository;

@Service
public class OrderDetailService {


    @Autowired
    private OrderDetailRepository orderDetailRepository;


    public void saveOrderDetailRepository( OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }
}
