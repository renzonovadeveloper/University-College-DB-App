package com.example.university.repo;

import com.example.university.domain.Staff;
import org.springframework.data.repository.CrudRepository;

/**
 * DataSource Management for the Students at the University.
 * <p>
 * Created by Renzo
 */
public interface StaffRepository extends CrudRepository<Staff, Integer> {
}





