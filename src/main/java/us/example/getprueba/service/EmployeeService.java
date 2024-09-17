package us.example.getprueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.example.getprueba.entity.Customer;
import us.example.getprueba.entity.Employee;
import us.example.getprueba.repository.CustomerRepository;
import us.example.getprueba.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public void saveEmployeeRepository( Employee employee) {
        employeeRepository.save(employee);
    }
}
