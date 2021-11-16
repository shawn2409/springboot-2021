package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeInformationService {

    public List<Employee> getAllEmployees();

    public List<Employee> findEmployeesByDept(String deptName);

    public Employee getEmployeeByName(String name);

    public Employee getEmployeeById(int id);

    public Employee saveEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void removeEmployee(int id);

}
