package us.example.getprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.example.getprueba.entity.Category;
import us.example.getprueba.entity.Employee;
import us.example.getprueba.service.CategoryService;
import us.example.getprueba.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public void saveEmployeeRepository(@RequestBody Employee employee){
        employeeService.saveEmployeeRepository(employee);
    }
}
