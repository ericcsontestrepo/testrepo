package com.nekadar.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nekadar.app.entities.Employee;
import com.nekadar.app.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployeesfromDB(PageRequest pageRequest) {
		return (List<Employee>) employeeRepository.findAll();
	}

}
