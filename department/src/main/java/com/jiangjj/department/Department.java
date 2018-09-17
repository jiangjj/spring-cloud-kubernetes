package com.jiangjj.department;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "document")
@Data
public class Department {
    @Id
    private String id;
    private String organizationId;
    private String name;
    private List<Employee> employees;
}
