package com.viva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viva.entities.Course;
import com.viva.repos.CourseRepo;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api")
public class CourseController {
	
	@Autowired
	CourseRepo courseRepo;
	
	
	@RequestMapping(path="/courses" , method=RequestMethod.GET)
	public List<Course> findAllCourses(){
		List<Course> courses = courseRepo.findAllCourses();
		return courses;
	}
	
	@RequestMapping(path="/courses/{id}" , method=RequestMethod.GET)
	public Course findCourseById(@PathVariable("id") int id){
//		List<Course> courses = courseRepo.findAllCourses();
		return courseRepo.findCourse(id);
	}
	@RequestMapping(path="/courses" , method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course){
		System.out.println(course);
		courseRepo.addCourse(course);
	}

}
