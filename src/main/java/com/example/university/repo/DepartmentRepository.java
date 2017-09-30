package com.example.university.repo;

import com.example.university.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DataSource Management for the Departments at the University.
 *
 * Created by rt
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
