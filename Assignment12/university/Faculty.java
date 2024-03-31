package Assignment12.university;

public class Faculty {
	 private String name;
	 private int facultyId;
	 private String department;
	 public Faculty(String string, int i, String string2) {
		this.name=string;
		this.facultyId=i;
		this.department=string2;
	}
	public String getName()
	 {
		 return name;
	 }
	 public int getFacultyId()
	 {
		 return facultyId;
	 }
	 public String getDepartment()
	 {
		 return department;
	 }

}
