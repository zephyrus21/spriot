package com.zephyrus.spriot.controllers;

import com.zephyrus.spriot.entities.Department;
import com.zephyrus.spriot.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
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
  public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
    return departmentService.fetchDepartmentById(departmentId);
  }

  @PostMapping(path = "/departments")
  public Department saveDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
  }

  @DeleteMapping(path = "/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted successfully";
  }
}
