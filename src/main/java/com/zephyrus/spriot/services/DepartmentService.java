package com.zephyrus.spriot.services;

import com.zephyrus.spriot.entities.Department;
import com.zephyrus.spriot.errors.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
  Department saveDepartment(Department department);

  List<Department> fetchDepartmentList();

  Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

  void deleteDepartmentById(Long departmentId);

  Department updateDepartment(Long departmentId, Department department);

  Department fetchDepartmentByName(String departmentName);
}
