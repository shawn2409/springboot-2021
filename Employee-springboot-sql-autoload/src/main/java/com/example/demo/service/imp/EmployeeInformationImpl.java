package com.example.demo.service.imp;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeInformationRepository;
import com.example.demo.service.EmployeeInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeInformationImpl implements EmployeeInformationService {

    @Autowired
    private final EmployeeInformationRepository employeeInformationRepository;

    public EmployeeInformationImpl(EmployeeInformationRepository employeeInformationRepository) {
        this.employeeInformationRepository = employeeInformationRepository;
    }

    //get all employees
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        /*Employee employee1 = new Employee(1, "abc", "ds@yahoo.com", "1/1/2020", "MNG", "HR");
        Employee employee2 = new Employee(2, "bcd", "as@yahoo.com", "2/1/2020", "Dev", "HR");

        employeeList.add(employee1);
        employeeList.add(employee2);*/

        return employeeInformationRepository.findAll();
    }


    @Override
    public List<Employee> findEmployeesByDept(String deptName) {
        List<Employee> employeeList = new ArrayList<>();

        /*Employee employee1 = new Employee(1, "abc", "ds@yahoo.com", "1/1/2020", "MNG", "HR");
        Employee employee2 = new Employee(2, "bcd", "as@yahoo.com", "2/1/2020", "Dev", "HR");

        employeeList.add(employee1);
        employeeList.add(employee2);*/

        return employeeInformationRepository.findEmployeeByDeptName(deptName);
    }


    // get Employee by email

    public Employee getEmployeeByName(String name) {

        return employeeInformationRepository.findEmployeeByName(name);
    }

    // get Employee by id
    @Override
    public Employee getEmployeeById(int id) {
        return employeeInformationRepository.findEmployeeById(id);
    }

    //save an employee
    @Override
    public Employee saveEmployee(Employee employee) {

        employee = employeeInformationRepository.save(employee);
        return employee;
    }


    //update an employee by email
    @Override
    public Employee updateEmployee(Employee employee) {
      //  Employee employeeDetails = (Employee) employeeInformationRepository.findEmployeeByDeptName(employee.getDeptName());
        Employee employeeDetails = (Employee) employeeInformationRepository.findEmployeeById(employee.getId());

        if (employeeDetails != null) {

            employeeDetails.setName(employee.getName());
            employeeDetails.setDeptName(employee.getDeptName());
            employeeDetails.setDob(employee.getDob());
            employeeDetails.setTitle(employee.getTitle());

            final Employee newEmployeeDetails = employeeInformationRepository.save(employeeDetails);
            return newEmployeeDetails;

        } else {
            return null;
        }
    }

    //delete employee by department name
    @Override
    public void removeEmployee(int id) {
         employeeInformationRepository.deleteById(id);

    }
}
