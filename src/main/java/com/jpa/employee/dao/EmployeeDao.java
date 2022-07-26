package com.jpa.employee.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.employee.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>
{
	List<Employee> findByLastNameEmployeeInfo(String lastName);

	List<Employee> findByFirstNameAndEmail(String firstName, String email);
}
