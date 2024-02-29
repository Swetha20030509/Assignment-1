package Assignment_5;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many person");
		int numberperson=sc.nextInt();
		int weight[][]=new int[numberperson][];
		int minarray[]=new int[numberperson];
		int min=0;
		int count=0;
		for(int i=0;i<numberperson;i++)
			{
				count=0;
				System.out.println("Enter the number of weights for person "+(i+1));
				int numberWeight=sc.nextInt();
				weight=new int[numberperson][numberWeight];
				System.out.println("Enter the weights for person "+(i+1));
				for(int j=0;j<numberWeight;j++)
				{
					weight[i][j]=sc.nextInt();
					if(min>weight[i][j]&&count==1)
						min=weight[i][j];
					else if(count==0)
					{
						min=weight[i][j];
						count++;
					}
				}
				minarray[i]=min;
			}
		System.out.println("Enter the person number to calculate minimum weight");
		int num=sc.nextInt();
		if(num<=numberperson)
		{
		System.out.println("The minimum weight"+minarray[num-1]);
		}
		else
		{
			System.out.println("Invalid person");
		}

	}

}
