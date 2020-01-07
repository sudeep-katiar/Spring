package com.example.demo.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/display")
	public String name() {
		return "Amit";
	}

	@GetMapping("/topics")
	public List<Course> getAllCourse() {
		return courseservice.getAllCourses();
	}
	
	@RequestMapping("/topics/{id}")
	public Course getTopic(@PathVariable String id)
	{
		return courseservice.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Course topic)
	{
		courseservice.addCourse(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics{id}")
	public void updateTopic(@RequestBody Course topic, @PathVariable String id)
	{
		courseservice.updateCourse(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics")
	public void deleteTopic(@RequestBody String id)
	{
		courseservice.deleteCourse(id);
	}
	
}
