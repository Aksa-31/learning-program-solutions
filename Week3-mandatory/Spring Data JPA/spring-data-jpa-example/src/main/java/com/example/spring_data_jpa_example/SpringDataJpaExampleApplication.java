package com.example.spring_data_jpa_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring_data_jpa_example.model.Employee;
import com.example.spring_data_jpa_example.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaExampleApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setName("Alice");
		emp.setDepartment("Engineering");
		emp.setSalary(50000);

		employeeService.addEmployee(emp);

		System.out.println("Employee added successfully.");
	}
}
