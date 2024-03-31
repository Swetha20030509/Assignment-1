package Assignment12.university;

public class Course {
	 private String courseName;
	 private int courseId;
	 public Course(String string, int i) {
		this.courseName=string;
		this.courseId=i;
	}
	public String getCourseName()
	 {
		 return courseName;
	 }
	 public int getCourseId()
	 {
		 return courseId;
	 }
}
