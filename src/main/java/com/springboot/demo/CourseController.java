package com.springboot.demo;


import com.springboot.demo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Max;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestController()
public class CourseController {
    @Autowired
    //CourseRepository courseRepository;
    CourseService courseService;
//
//    @Autowired
//    RestTemplate restTemplate;

  //  List<Course> courses= Arrays.asList(new Course(101,"java","core java"),new Course(102,"sql","postgres"));
    @RequestMapping(value = "/courses",method = RequestMethod.GET)
    public List<Course> getAllCourses(){

        return courseService.getAllCourses();

        //return courses;
    }
    @RequestMapping(value = "/courses",method = RequestMethod.POST)
    public void createCourse(@RequestBody Course course){
        courseService.createCourse(course);
    }


    @RequestMapping(value = "/courses/{id}",method = RequestMethod.GET)
public Course getCourse(@PathVariable int id)
    {
        return courseService.getCourse(id);
    }
    @RequestMapping(value = "/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }
    @RequestMapping(value = "/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

//    Iterator<Course> iterator=courses.iterator();
//while (iterator.hasNext()){
//Course course=iterator.next();
//if(course.getId()==id){
//return course;
//}
//}
//return null;


    @RequestMapping(value = "/find")
    public void findcouurse(){}
}

