package com.zephyrus.spriot.controllers;

import com.zephyrus.spriot.entities.Department;
import com.zephyrus.spriot.errors.DepartmentNotFoundException;
import com.zephyrus.spriot.services.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
  private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

  @Autowired
  private DepartmentService departmentService;

  @PutMapping(path = "/departments/{id}")
  public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
    return departmentService.updateDepartment(departmentId, department);
  }

  @GetMapping(path = "/departments")
  public List<Department> fetchDepartmentList() {
    return departmentService.fetchDepartmentList();
  }

  @GetMapping(path = "/departments/{id}")
  public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
    return departmentService.fetchDepartmentById(departmentId);
  }

  @PostMapping(path = "/departments")
  public Department saveDepartment(@Valid @RequestBody Department department) {
    LOGGER.info("Inside saveDepartment of DepartmentController");
    return departmentService.saveDepartment(department);
  }

  @DeleteMapping(path = "/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted successfully";
  }

  @GetMapping(path = "/departments/name/{name}")
  public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
    return departmentService.fetchDepartmentByName(departmentName);
  }
}
