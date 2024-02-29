package Assignment_5;
import java.util.*;
import java.util.Scanner;
public class spiral {
	public void print(int number)
	{
		int array[][]=new int[number][number];
		int row=0;
		int rowEnd=number-1;
		int column=0;
		int columnEnd=number-1;
		int count=1;
		while(row<=rowEnd&&column<=columnEnd)
		{
			for(int i=row;i<=rowEnd;i++)
			{
				array[i][row]=count++;
			}
			row++;
			for(int j=row;j<=rowEnd;j++)
			{
				array[rowEnd][j]=count++;
			}
			rowEnd--;
			for(int k=rowEnd;k>=column;k--)
			{
				array[k][columnEnd]=count++;
			}
			columnEnd--;
			for(int L=rowEnd;L>=row;L--)
			{
				array[column][L]=count++;
			}
			column++;
		}
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	spiral obj=new spiral();
	obj.print(number);
	}

}
