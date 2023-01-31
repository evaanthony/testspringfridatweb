package com.example.testspringfridayweb;

import com.example.testspringfridayweb.model.Employee;
import com.example.testspringfridayweb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestspringfridaywebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestspringfridaywebApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ibrahim");
		employee.setLastName("Nassor");
		employee.setEmailId("ibranassor@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ali");
		employee1.setLastName("Hamad");
		employee1.setEmailId("hamadali@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("KHALID");
		employee2.setLastName("AHMAD");
		employee2.setEmailId("khalidahmad@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setFirstName("KHALID");
		employee3.setLastName("AHMAD");
		employee3.setEmailId("khalidahmad@gmail.com");
		employeeRepository.save(employee3);


	}
}
