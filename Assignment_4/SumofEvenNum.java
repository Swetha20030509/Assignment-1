package Assignment_4;
import java.util.Scanner;
public class SumofEvenNum {

	public int evenSum(int array[])
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
				continue;
			else
				sum+=array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumofEvenNum obj=new SumofEvenNum();
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("sum : "+obj.evenSum(array));
	}

}
