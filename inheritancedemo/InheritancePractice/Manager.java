package InheritancePractice;
class Manager extends Employee{
	String name="mala";
	int age=21;
	double salary=50000;
	String departmentName="software";
	public void display()
	{
		System.out.println("Manager");
		System.out.println("Name     age      salary    departmentName");
		System.out.println(name+"  "+age+"  "+salary+"  "+departmentName);
	}
	public void work()
	{
		System.out.println("Manager Working.....");
	}
	public void manageTeam()
	{
		System.out.println("manager");
	}
}
