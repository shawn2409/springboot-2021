package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@Repository
public interface EmployeeInformationRepository extends JpaRepository<Employee, Integer> {

    //derived methods

    public Employee findEmployeeByName(String name);

    public List<Employee> findEmployeeByDeptName(String deptName);

    public Employee findEmployeeById(int id);

    //public int deleteEmployeeById(int id);
}
