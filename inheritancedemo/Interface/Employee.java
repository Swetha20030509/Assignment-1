package Interface;
/*class Employee implements Interface1 {
	String name="satha";
	int age=21;
	double salary=10000;
	
	public void display()
	{
		System.out.println("Employee");
		System.out.println("Name     age      salary");
		System.out.println(name+"   "+age+"   "+salary);
	}
	public void work()
	{
		System.out.println(" Employee Working.....");
	}
}*/
class Employee extends Person implements Interface2
{
	String name="satha";
	int age=21;
	double salary=10000;
	public void display()
	{
		System.out.println("Employee");
		System.out.println("Name     age      salary");
		System.out.println(name+"   "+age+"   "+salary);
	}
	public void work()
	{
		System.out.println(" Employee Working.....");
	}
}
