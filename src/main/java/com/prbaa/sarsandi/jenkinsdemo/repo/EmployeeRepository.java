package com.prbaa.sarsandi.jenkinsdemo.repo;

import com.prbaa.sarsandi.jenkinsdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
