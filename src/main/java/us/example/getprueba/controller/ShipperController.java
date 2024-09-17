package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Shipper;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.ShipperService;

@RestController
@RequestMapping("/api")
public class ShipperController {
    @Autowired
    private ShipperService shipperService;
    @PostMapping("/shipper")
    public void saveShipperRepository(@RequestBody Shipper shipper){
        shipperService.saveShipperRepository(shipper);
    }
}
