package com.jiangjj.organization;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "organization")
public class Organization {
    @Id
    private String id;
    private String name;
}
