package Assignment_3;
import java.util.*;
public class Greatestnumber  {
	/*
	 * Enter the number 1
	45
	Enter the number 2
	78
	Enter the number 3
	23
	The greatest number is:78
	 */
	public int findgreatest(int num1,int num2,int num3)
	{
		if(num1>=num2&&num1>=num3)
		return num1;
		else if(num2>=num1&&num2>=num3)
		return num2;
		else 
		return num3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2");
		int num2=sc.nextInt();
		System.out.println("Enter the number 3");
		int num3=sc.nextInt();
		Greatestnumber obj=new Greatestnumber();
		System.out.println("The greatest number is:"+obj.findgreatest(num1,num2,num3));
	}

}
