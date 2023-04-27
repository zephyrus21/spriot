package com.zephyrus.spriot.services;

import com.zephyrus.spriot.entities.Department;

import java.util.List;

public interface DepartmentService {
  Department saveDepartment(Department department);

  List<Department> fetchDepartmentList();

  Department fetchDepartmentById(Long departmentId);

  void deleteDepartmentById(Long departmentId);

  Department updateDepartment(Long departmentId, Department department);
}
