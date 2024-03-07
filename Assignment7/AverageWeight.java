package Assignment7;
import java.util.Scanner;
public class AverageWeight {

	public float findAverage(int numberOfPerson,Double totalWeight)
	{
		return (float)(totalWeight/numberOfPerson);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AverageWeight  averageweight=new AverageWeight();	
		double totalWeight=0;
		System.out.println("Enter the 10 person weight");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the "+i+" person weight");
			totalWeight+=sc.nextDouble();
		}
		System.out.println("The average weight for 10 persons :"+averageweight.findAverage(10, totalWeight));

	}

}
