package com.example.university.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA Entity representing the University staff
 * <p>
 * Created by Renzo
 */
@Entity
@Table(name = "STAFF")
public class Staff {
    @Id
    @GeneratedValue
    private Integer staffId;

    @Column
    private boolean fullTime;
    
    @Column
    private String title;
    

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    @Column
    private double salary;
    

    @Column
    private Integer age;

    @Embedded
    private Person attendee;

    @OneToMany
    private List<Course> courses = new ArrayList<>();

    public Staff(Person attendee, boolean fullTime, Integer age, String tittle) {
        this.attendee = attendee;
        this.fullTime = fullTime;
        this.age = age;
        this.title=tittle;
        courses = new ArrayList<>();
    }

    protected Staff() {
    }

    public Integer getStudentId() {
        return staffId;
    }

    public Person getAttendee() {
        return attendee;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
      return salary;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public Integer getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Staff{" + "Staff ID=" + staffId + ", " + attendee + ", fullTime=" + fullTime +
                ", age=" + age + " tittle=" + title +"}\n";
    }
}
