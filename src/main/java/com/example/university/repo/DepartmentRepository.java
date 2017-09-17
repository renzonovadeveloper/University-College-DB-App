package com.example.university.repo;

import com.example.university.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DataSource Management for the Departments at the University.
 * <p>
 * Created by Renzo.
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
