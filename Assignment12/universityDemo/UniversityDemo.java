package Assignment12.universityDemo;

import Assignment12.university.Course;
import Assignment12.university.Faculty;
import Assignment12.university.Student;

public class UniversityDemo {

	public static void main(String[] args) {
		Course course=new Course("java",1);
		Faculty faculty=new Faculty("Swetha",12,"java");
		Student student=new Student("swetha",123,"java");
		System.out.println("***********STUDENT DETAIL*************");
		System.out.println("Student Name "+student.getName());
		System.out.println("Depart Name "+student.getDepartment());
		System.out.println("********COURSE DETAIL************");
		System.out.println("Course Name "+course.getCourseName());
		System.out.println("Course Id "+course.getCourseId());
	}
}
