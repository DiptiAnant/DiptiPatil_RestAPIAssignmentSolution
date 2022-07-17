package com.greatlearning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Employee;
import com.greatlearning.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		
		//List<Employee> employees = new ArrayList<Employee>();
		
		return employeeRepository.findAll().stream().sorted((e1, e2)->e1.getFirstName().compareTo(e2.getFirstName())).collect(Collectors.toList());
		
		
		
		//return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
