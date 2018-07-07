package com.springboot.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    int id;
    @Column(name = "coursename")
    String CourseName;
    @Column(name = "coursedescription")
    String CourseDescription;
    public Course(){}


    public Course(int id, String courseName, String courseDescription) {

        this.id = id;
        this.CourseName = courseName;
        this.CourseDescription = courseDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

}
