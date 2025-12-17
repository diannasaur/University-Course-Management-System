package UniversityManagementSystem;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private ArrayList<Course> enrolledCourses;
	
	//Student constructor
	public Student (String name) {
		this.name = name;
		this.enrolledCourses = new ArrayList<>();
	}
	
	//adds a course into enrolledCourses
	public void addCourse(Course course) {
		enrolledCourses.add(course); 
	}
	
	//prints a student and the number of their classes
	public String toString() {
		return "Student: " + name + ", # of Enrolled Courses: " + enrolledCourses.size();
	}
}
