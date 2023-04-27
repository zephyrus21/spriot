package com.zephyrus.spriot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentId;
  private String departmentName;
  private String departmentCode;
  private String departmentAddress;

  public Department() {
  }

  public Department(Long departmentId, String departmentName, String departmentCode, String getDepartmentAddress) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.departmentCode = departmentCode;
    this.departmentAddress = getDepartmentAddress;
  }

  @Override
  public String toString() {
    return "Department{" +
        "departmentId=" + departmentId +
        ", departmentName='" + departmentName + '\'' +
        ", departmentCode='" + departmentCode + '\'' +
        ", getDepartmentAddress='" + departmentAddress + '\'' +
        '}';
  }

  public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public String getDepartmentAddress() {
    return departmentAddress;
  }

  public void setDepartmentAddress(String getDepartmentAddress) {
    this.departmentAddress = getDepartmentAddress;
  }
}
