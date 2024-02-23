package Assignment_4;
import java.util.Scanner;
public class Numberoccursforsecondtime {
	/*
	 * Enter the size of array
		6
	Enter the element
	2
	3
	4
	5
	6
	2
	Enter the number
	2
	Index :5
	 */

	public int findIndex(int array[],int number)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(number==array[i])
			{
				count++;
				if(count==2)
					return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Numberoccursforsecondtime obj=new Numberoccursforsecondtime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("Index :"+obj.findIndex(array,number));
	}

}
