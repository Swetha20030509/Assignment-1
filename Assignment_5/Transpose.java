package Assignment_5;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		int matrix[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i;j<matrix[i].length;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

}
