package com.example.university;

import com.example.university.domain.Person;
import com.example.university.domain.Staff;
import com.example.university.domain.Student;
import com.example.university.repo.StaffRepository;
import com.example.university.repo.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Demonstrate Creation, Reading, Updating, and Deletion of Students with StudentRepository
 * <p>
 * Created by Renzo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudRepositoryDemo {


  @Autowired
  StudentRepository studentRepository;

  @Autowired
  StaffRepository staffRepository;
  
  /**
   * Exercise CrudRepository methods.
   */
  @Test
  public void simpleStudentCrudExample() {
    boolean fullTime = true;
    studentRepository.save(new Student(new Person("jane", "doe"), fullTime, 20));
    studentRepository.save(new Student(new Person("john", "doe"), fullTime, 22));
    studentRepository.save(new Student(new Person("mike", "smith"), fullTime, 18));
    studentRepository.save(new Student(new Person("ally", "kim"), !fullTime, 19));

    System.out.println("\n*************Original Students*************");
    studentRepository.findAll().forEach(System.out::println);

    // age up the students
    studentRepository.findAll().forEach(student -> {
      student.setAge(student.getAge() + 1);
      studentRepository.save(student);
    });

    System.out.println("\n*************Students a year older*************");
    studentRepository.findAll().forEach(System.out::println);

    studentRepository.deleteAll();
    System.out.println("\n*************Students removed*************");
    studentRepository.findAll().forEach(System.out::println);

  }
  
  @Test
  public void simpleStaffCrudExample() {
    boolean fullTime = true;
    staffRepository.save(new Staff(new Person("mark", "snyder"), fullTime, 30,"Professor staff"));
    staffRepository.save(new Staff(new Person("dav", "doe"), fullTime, 42,"Professor staff"));
    staffRepository.save(new Staff(new Person("tom", "smith"), fullTime, 50,"Clerk"));
    staffRepository.save(new Staff(new Person("ally", "Tejada"), !fullTime, 23, "President"));

    System.out.println("\n*************Original Staffs*************");
    staffRepository.findAll().forEach(System.out::println);

    // age up the students
    staffRepository.findAll().forEach(student -> {
      student.setAge(student.getAge() + 1);
      staffRepository.save(student);
    });

    System.out.println("\n*************Staffs a year older*************");
    staffRepository.findAll().forEach(System.out::println);

    staffRepository.deleteAll();
    System.out.println("\n*************Staffs removed*************");
    staffRepository.findAll().forEach(System.out::println);

  }


}
