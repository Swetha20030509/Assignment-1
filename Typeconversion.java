package Assignment_1;
import java.util.Scanner;
public class Typeconversion {
	/*
	 * Enter the Float value
		12.567
	   Enter the Double vlaue
       12.6578556
       Enter the Integer value
       123456778
                     Float to int     12.567---->12
                     Double to float     12.6578556---->12.657856
                     int to short       123456778---->-13046
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Float value");
		float f1=sc.nextFloat();
		System.out.println("Enter the Double vlaue");
		double d1=sc.nextDouble();
		System.out.println("Enter the Integer value");
		int i1=sc.nextInt();
		int a=(int)f1;
		float f2=(float)d1;
		short s1=(short)i1;
		System.out.println("Float to int     "+f1+"---->"+a);
		System.out.println("Double to float     "+d1+"---->"+f2);
		System.out.println("int to short       "+i1+"---->"+s1);
	}

}
