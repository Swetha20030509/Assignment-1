package Assignment_2;
import java.util.*;
public class Quadraticequation {
	public void find(int a,int b,int c)
	{
		double r1;
		double r2;
		int d=b*b-4*a*c;
		if(d>0)
		{
			r1=(-b-Math.pow(d, 0.5))/(2*a);
			r2=(-b+Math.pow(d, 0.5))/(2*a);
			System.out.println(r1+""+r2);
		}
		else if(d==0)
		{
			r1=-b/(2*a);
			System.out.println(r1);
		}
		else
		{
			System.out.println("root are not real");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	System.out.println("Enter c value");
	int c=sc.nextInt();
	Quadraticequation obj=new Quadraticequation();
	obj.find(a,b,c);
	}
}