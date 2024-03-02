package InheritancePractice;

public class Inheritance2 {
	public static void main(String args[])
	{
		Manager man1=new Manager();
		man1.manageTeam();
		Employee man2=new Manager();
		man2.work();
		Manager man3=(Manager)man2;
		man3.manageTeam();
	}

}
