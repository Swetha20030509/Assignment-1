package Assignment12.university;

public class Student {
	private String name;
    private int studentId;
    private String department;
    public Student(String string, int i, String string2) {
		this.name=string;
		this.studentId=i;
		this.department=string2;
	}
	public String getName()
    {
    	return name;
    }
    public int getId()
    {
    	return studentId;
    }
    public String getDepartment()
    {
    	return department;
    }

}
