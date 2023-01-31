package com.example.testspringfridayweb.repository;

import com.example.testspringfridayweb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //crud start
}
