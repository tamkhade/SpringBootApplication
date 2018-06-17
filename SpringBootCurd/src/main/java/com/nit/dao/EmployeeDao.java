package com.nit.dao;

import org.springframework.data.repository.CrudRepository;

import com.nit.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
