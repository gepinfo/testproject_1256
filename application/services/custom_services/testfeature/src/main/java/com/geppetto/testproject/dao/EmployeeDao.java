package com.geppetto.testproject.dao;

import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import com.geppetto.testproject.model.Employee;

public interface EmployeeDao {

    Optional<Employee> getEmployeeById(String id);

    Page<Employee> getAllEmployee(Pageable pageable);

    Employee createEmployee(Employee employee);

    void deleteEmployee(String id);

    Optional<Employee> updateEmployee(String id);

}

