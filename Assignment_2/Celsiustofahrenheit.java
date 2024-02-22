package Assignment_2;
import java.util.Scanner;
public class Celsiustofahrenheit {
	/*
	 * Sample output:-
	 * 				Enter the celsius value:
					25
					Temperature in Fahrenheit is:77
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celsius value:");
		int celsius=sc.nextInt();
		int fahrenheit=((celsius*9)/5)+32;
		System.out.println("Temperature in Fahrenheit is:"+fahrenheit);
	}

}
