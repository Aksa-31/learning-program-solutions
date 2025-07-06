package com.example.spring_data_jpa_example;

import com.example.springdatajpaexample.model.Employee;
import com.example.springdatajpaexample.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void testSaveAndGetAllEmployees() {
        Employee employee = new Employee();
        employee.setName("Aksa");
        employee.setDepartment("CSE");
        employee.setSalary(50000.0);

        employeeService.saveEmployee(employee);
        List<Employee> employees = employeeService.getAllEmployees();

        assertNotNull(employees);
        System.out.println("Employees: " + employees);
    }
}
