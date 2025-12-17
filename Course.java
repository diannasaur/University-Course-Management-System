package UniversityManagementSystem;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private String courseCode;
	private int maxStudents;
	private ArrayList<Student> enrolledStudents;
	
	//Course constructor 
	public Course(String courseName, String courseCode, int maxStudents) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.maxStudents = maxStudents; 
		this.enrolledStudents = new ArrayList<>(); 
	}
	
	//returns course code
	public String getCourseCode() {
		return courseCode; 
	}
	
	//returns an ArrayList of Students
	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents; 
	}
	
	//prints the course name, course code and max students
	public String toString() {
		return "Course: " + courseName + " (" + courseCode + "), Max Students: " + maxStudents + ", Enrolled: " + enrolledStudents.size();
	}
	
	//test if the size of the ArrayList of Students for this course is greater than the max number of students
	public boolean enrollStudent(Student student) {
		if (enrolledStudents.size() >= maxStudents) {
			System.out.println("The course is full.");
			return false;
		} else {
			enrolledStudents.add(student);
			System.out.println("Enrollment successful!");
			return true;
		}
	}
}




