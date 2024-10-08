package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.entity.Shipper;
import us.example.getprueba.repository.CustomerRepository;
import us.example.getprueba.repository.ShipperRepository;

@Service
public class ShipperService {
    @Autowired
    private ShipperRepository shipperRepository;


    public void saveShipperRepository( Shipper shipper) {
        shipperRepository.save(shipper);
    }
}
