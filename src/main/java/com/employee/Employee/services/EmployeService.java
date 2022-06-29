package com.employee.Employee.services;

import com.employee.Employee.model.Employee;

import java.util.List;

public interface EmployeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
