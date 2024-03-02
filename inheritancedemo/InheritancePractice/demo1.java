package InheritancePractice;

import java.util.Arrays;

public class demo1 {
	
	public static void main(String[] args) {
		Person person1=new Person();	//upcasting
		person1.display();
		person1.great();
		System.out.println(person1.name);
		System.out.println(person1.age);
		Person person2=new Employee();
		person2.great();	//parent method call
		person2.display();//over ride
		System.out.println(person2.age);	//parent age print
		System.out.println(person2.name);	//parent name print
		Person person3=new Manager();
		person3.display();
		System.out.println(person3.name);	//parent name print
		Employee person4=(Employee)person2;	//down casting
		person4.work();				// employee method call
	}

}
