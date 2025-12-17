package UniversityManagementSystem;

import java.util.ArrayList;
import java.util.Scanner; 

public class SchoolManager {

	private ArrayList<Course> courses = new ArrayList<>();
	private ArrayList<Student> students = new ArrayList<>();
	
	//adds a course to courses
	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("Course Added Successfully"); 
	}
	
	//add a student to students
	public void addStudent(Student student) {
			students.add(student);
			System.out.println("Student Added Successfully");
	}
	
	//prints each course in courses
	public void displayAllCourses() {
		for (Course course : courses) {
			System.out.println(course);
		}
	}
	
	//prints each student in students
	public void displayAllStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
	
	//adds a student to courses and vice-vera 
	public void enrollStudentsInCourse (String studentName, String courseCode) {
		
		Student student = null;
		for (Student s : students) {
			if(s.toString().contains(studentName)) {
				student = s;
				break;
			}
		} 
		
		Course course = null;
		for (Course c : courses) {
			if(c.toString().contains(courseCode)) {
				course = c;
				break;
			}
		}
		
		if (student != null && course != null) {
			 course.enrollStudent(student);
			 student.addCourse(course);
		} else {
			if (student == null) {
                System.out.println("Student, " + studentName + ", not found.");
            }
            if (course == null) {
                System.out.println("Course, " + courseCode + ", not found.");
            }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolManager manager = new SchoolManager();
		Scanner in = new Scanner(System.in);
		
		//displays a splash menu
		while(true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Course");
			System.out.println("2. Add Student");
			System.out.println("3. Enroll Student in Course");
			System.out.println("4. Display All Courses");
			System.out.println("5. Display All Students");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = in.nextInt();
			in.nextLine();
			
			if (choice == 1) { 
				
				System.out.println("\nEnter course name (then press Enter), code (then press Enter), max students (then press Enter): ");
				String courseName = in.nextLine();
				String courseCode = in.nextLine();
				int maxStudents = in.nextInt();
				
				Course course = new Course(courseName, courseCode, maxStudents);
				manager.addCourse(course);
				
			} else if (choice == 2) {
				
				System.out.println("\nEnter Student Name: ");
				String studentName = in.nextLine();
				
				Student student = new Student(studentName);
				manager.addStudent(student);
				
			} else if (choice == 3) {
				
				System.out.println("\nEnter student name:");
				String studentName = in.nextLine();
				
				System.out.println("\nEnter course code:");
				String courseCode = in.nextLine();
				
				manager.enrollStudentsInCourse(studentName, courseCode);
				
			} else if (choice == 4) {
				
				manager.displayAllCourses();
				
			} else if (choice == 5) {
				
				manager.displayAllStudents();
				
			} else if (choice == 0) {
				
				System.out.println("\nExisting...");
				break;
				
			} else {
				
				System.out.println("\nInvalid choice. Try again!"); 
				
			}
				
		}
		
		in.close();
		
	}

}
