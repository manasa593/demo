package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

//import javax.validation.constraints.Max;

@Service
public class CourseService {
    @Autowired
   CourseRepository courseRepository;
    public List<Course> getAllCourses(){
        List<Course> list=new ArrayList<>();
        courseRepository.findAll().forEach(new Consumer<Course>() {
            @Override
            public void accept(Course course) {
                list.add(course);
            }
        });

        return list;
    }
    public Course getCourse(int id){
        Optional<Course> optionalCourse=courseRepository.findById(id);
        if(optionalCourse.isPresent()){
            return optionalCourse.get();
        }
        return null;
    }
    public void createCourse(Course course){
        courseRepository.save(course);
    }
    public void deleteCourse(int id){
        courseRepository.deleteById(id);
    }
    public void updateCourse(Course course){
        courseRepository.save(course);
    }

}
