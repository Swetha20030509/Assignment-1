package Assignment_1;
import java.util.Scanner;
public class Swapnumber {
	/*
	 * Enter the a value
		12
		Enter the b value
		67
		Before swap
		A :12
		B :67
		After swap
		A :67
		B :12
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		System.out.println("Before swap");
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		System.out.println("After swap");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A :"+a);
		System.out.println("B :"+b);
	
		

	}

}
