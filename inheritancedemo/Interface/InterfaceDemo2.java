package Interface;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Interface2 in2=new Employee();
		//obj.great(); not implement in employee class
		in2.display();// interface 2 method inside display method override for employee class

	}

}
