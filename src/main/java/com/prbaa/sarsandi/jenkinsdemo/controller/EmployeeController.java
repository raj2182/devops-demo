package com.prbaa.sarsandi.jenkinsdemo.controller;

import com.prbaa.sarsandi.jenkinsdemo.model.Employee;
import com.prbaa.sarsandi.jenkinsdemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
   @PostMapping("/postEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return new ResponseEntity<Employee>(HttpStatus.CREATED).getBody();

    }
    @GetMapping("/getEmployee")
    public ResponseEntity<List<Employee>> getEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
