package com.example.demo.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courserepository;

	private List<Course> courses = Arrays.asList(
			new Course("Spring", "Spring Framework", "Spring Framework Description"),
			new Course("Java", "Core Java", "Core Java Description"));

	public List<Course> getAllCourses() {
		//return topics;
		List<Course> courses = new ArrayList<>();
		courserepository.findAll()
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id)
	{
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courserepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courserepository.save(course);
	}

	public void updateCourse(String id, Course course) {
//		for(int i = 0; i<topics.size(); i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.set(i, topic);
//				return;
//			}
//		}
		courserepository.save(course);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courserepository.deleteById(id);
	}

}
