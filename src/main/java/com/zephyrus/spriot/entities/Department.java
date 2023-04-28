package com.zephyrus.spriot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentId;
  @NotBlank(message = "Department name is required")
  private String departmentName;
  @NotBlank(message = "Department code is required")
  private String departmentCode;
  @NotBlank(message = "Department address is required")
  private String departmentAddress;
}
