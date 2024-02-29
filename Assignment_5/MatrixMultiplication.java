package Assignment_5;
import java.util.*;
import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matrix1[][]=new int[][] {{1,1,1},{2,2,2}};
		int matrix2[][]=new int[][] {{1,2},{4,5},{7,8}};
		int result[][]=new int[matrix1.length][matrix1.length];
		int value=0;
		if(matrix1[0].length==matrix2.length)
		{
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix2[i].length;j++)
			{
				for(int k=0;k<matrix2.length;k++)
				{
					value+=matrix1[i][j]*matrix2[k][i];
				}
				result[i][j]=value;
				value=0;
			}
		}
		}
		else
		{
			System.out.println("Invalid");
		}
}
}
