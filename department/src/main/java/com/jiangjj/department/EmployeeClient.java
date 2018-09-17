package com.jiangjj.department;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee")
public interface EmployeeClient {
    @GetMapping("/department/{departmentId}")
    List findByDepartment(@PathVariable("departmentId") String departmentId);
}
