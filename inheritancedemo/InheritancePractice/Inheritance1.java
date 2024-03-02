package InheritancePractice;
public class Inheritance1 {

	public static void main(String[] args) {
		Employee emp1=new Employee();
			emp1.great();	//parent class great method call
			emp1.work();	//employee class inside work method call
		Employee emp2=new Manager();
			System.out.println(emp2.name);		//employee class name is print
			//emp2.manageTeam()// it is not call because not inside employee class 
			emp2.work();	//manager class method is  call override
			emp2.great();//parent class great call not override the employee class
		Manager emp3=(Manager)emp2;
		emp3.manageTeam();// manage inside method call
	}

}
