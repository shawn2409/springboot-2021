package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = EmployeeController.PATH)
public class EmployeeController {

    public static final String PATH = "/employees";

    @Autowired
    private final EmployeeInformationService employeeInformationService;

    public EmployeeController(EmployeeInformationService employeeInformationService) {
        this.employeeInformationService = employeeInformationService;
    }

    ////////////////////////////////////////


    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
   // public List<Employee> getEmployeeDetails(@RequestParam("deptName") String deptName) {
    public List<Employee> getEmployeeDetails(){

        return employeeInformationService.getAllEmployees();
    }

    @GetMapping("/department")
    @ResponseStatus(code = HttpStatus.OK)
    // public List<Employee> getEmployeeDetails(@RequestParam("deptName") String deptName) {
    public List<Employee> getEmployeesByDepartment(@RequestParam String deptName){

        return employeeInformationService.findEmployeesByDept(deptName);
    }


    /*@GetMapping("/employee/{name}")
    @ResponseStatus(code = HttpStatus.OK)
    public Employee getEmployee(@PathVariable("name") String name) {

        return employeeInformationService.getEmployeeByName(name);

    }*/

    @GetMapping("/employee/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Employee getEmployee(@PathVariable("id") int id) {

        return employeeInformationService.getEmployeeById(id);
    }

    /*@PostMapping(value = "/employee",produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseStatus(code = HttpStatus.OK)
    public int saveEmployee(@RequestBody Employee employee) {

        employeeInformationService.saveEmployee(employee);

        return employee.getId();

    }*/

    @RequestMapping(value = "/employee", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseStatus(code = HttpStatus.OK)
    public int saveEmployee(@RequestBody Employee employee) {

        employeeInformationService.saveEmployee(employee);

        return employee.getId();

    }

/////////////////////////

    @PutMapping(value = "/employee/update")
    public String updateEmployee(@RequestBody Employee newEmployee) {

        employeeInformationService.updateEmployee(newEmployee);

        return "Employee updated inside employee service";
    }

    /*@DeleteMapping(value = "/employee/remove/{id}")
    public void removeEmployeeByEmail(@PathVariable("id") int id) {

        // log.debug("entering delete employee");

        employeeInformationService.removeEmployee(id);


    }*/

     @DeleteMapping(value = "/employee/remove/{id}")
    public String removeEmployeeByEmail(@PathVariable("id") int id) {

        // log.debug("entering delete employee");

        employeeInformationService.removeEmployee(id);

        return "Employee information deleted";

    }
}
