package com.jiangjj.department;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {
    List<Department> findByOrganizationId(String organizationId);
}
