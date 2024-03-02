package Interface;
class Person implements Interface1{
	String name="swetha";
	int age=21;
	public void display()
	{
		System.out.println("Person");
		System.out.println("Name   age");
		System.out.println(name+" "+age);
	}
	public void great()
	{
		System.out.println("Person I am "+name);
	}

}