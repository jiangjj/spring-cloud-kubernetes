package com.jiangjj.employee;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
@Data
public class Employee {
    @Id
    private String id;
    private Long organizationId;
    private Long departmentId;
    private String name;
    private int age;
    private String position;
}
