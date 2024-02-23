package Assignment_4;
import java.util.Scanner;
public class Primenumber {
	/*
	 * Sample output:-
	 * 		Prime number :
			2
			3
			5
			7
			11
			13
			17
			19
			23
			29
	 */
	public boolean isprime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Primenumber obj=new Primenumber();
	System.out.println("Prime number :");
	for(int i=1;i<=30;i++)
	{
		if(obj.isprime(i))
		{
			System.out.println(i);
		}
	}
	}

}
