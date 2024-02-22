package Assignment_3;
import java.util.Scanner;
public class Factorial {
	/*
	 * Sample output
	 * 		Enter the number
			5
		The giver number factorial is :120
	 */
	public void findfactorial(int number)
	{
		int fac=1;
		for(int i=1;i<=number;i++)
		{
			fac*=i;
		}
		System.out.println("The giver number factorial is :"+fac);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Factorial obj=new Factorial();
		obj.findfactorial(num);
		int x=1,i;
		out:
		for(i=0;i<10;i++)
		{
		   while(x++<50)
		     if(i*x==400)
			break out;
		}
		System.out.println(i + x);
	}

}
