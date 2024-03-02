package Interface;

public class Interfacedemo1 {

	public static void main(String[] args) {
		Interface1 in1=new Person();
		Interface1 in2=new Employee();
		in1.display();
		in1.great();
		in2.display();
	}

}
