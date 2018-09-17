package com.jiangjj.department;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Employee {
    private String id;
    private Long organizationId;
    private Long departmentId;
    private String name;
    private int age;
    private String position;
}
