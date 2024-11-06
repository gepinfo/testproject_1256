package com.geppetto.testproject.repository;

import com.geppetto.testproject.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>  {
    
    Page<Employee> findAll(Pageable pageable);

}
