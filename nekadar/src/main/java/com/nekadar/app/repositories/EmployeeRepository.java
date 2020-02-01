package com.nekadar.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nekadar.app.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
