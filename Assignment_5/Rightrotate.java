package Assignment_5;
import java.util.*;
public class Rightrotate {

	public void rotate(int array[],int number)
	{
		for(int i=0;i<number;i++)
		{
			int num=array[0];
			for(int j=0;j<array.length-1;j++)
			{
				array[j]=array[j+1];
			}
			array[array.length-1]=num;
		}
		System.out.println("Right rotation :"+Arrays.toString(array));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("How many element rotate");
		int num=sc.nextInt();
		Rightrotate obj=new Rightrotate();
		obj.rotate(array,num);
	}

}
