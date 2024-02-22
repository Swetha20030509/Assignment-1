package Assignment_3;
import java.util.Scanner;
public class Multiplicationtable {
	/*
	 * Sample output:-
	 * 			Enter the number
				5
				1x5=5
				2x5=10
				3x5=15
				4x5=20
				5x5=25
				6x5=30
				7x5=35
				8x5=40
				9x5=45
				10x5=50
	 */
	public void printTable(int number)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+number+"="+i*number);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		Multiplicationtable obj=new Multiplicationtable();
		obj.printTable(number);
		sc.close();
	}

}
