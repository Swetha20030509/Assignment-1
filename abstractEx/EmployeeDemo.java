package abstractDemo;

import java.util.Scanner;

abstract class Employee
{
	String name;
	int id;
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public abstract void calculatePay();
	public void getDeatil()
	{
		System.out.println("Employee Name"+name);
		System.out.println("Employee Id"+id);
	}
}
class HourlyEmployee extends Employee
{
	public HourlyEmployee(String name, int id, int hourworked,double hourlyRate) {
		super(name,id);
		this.hourworked=hourworked;
	}
	public void  calculatePay()
	{
		System.out.println("Salary :"+hourlyRate*hourworked);
	}
	double hourlyRate;
	int hourworked;
}
class SalaryEmployee extends Employee
{
	double salary;
	public SalaryEmployee(String name, int id, int i) {
		super(name,id);
		this.salary=i;
	}
	public void  calculatePay()
	{
		System.out.println("Salary :"+salary);
	}
	
}
public class EmployeeDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("****************HOURLY EMPLOYEE****************");
		System.out.println("Enter the Employee name");
		String name=sc.nextLine();
		System.out.println("Enter the Employee id");
		int id=sc.nextInt();
		System.out.println("Enter worked hour");
		int hourworked=sc.nextInt();
		Employee emp1=new HourlyEmployee(name,id,hourworked,1000);
		emp1.calculatePay();
		System.out.println("****************SALARY EMPLOYEE****************");
		System.out.println("Enter the Employee name");
		name=sc.nextLine();
		System.out.println("Enter the Employee id");
		id=sc.nextInt();
		SalaryEmployee emp2=new SalaryEmployee(name,id,10000);
		emp2.calculatePay();
		;
	}

}
