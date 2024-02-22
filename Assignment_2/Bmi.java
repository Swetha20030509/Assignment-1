package Assignment_2;
import java.util.Scanner;
public class Bmi {
	/*
	 * sample output
	 * 			Enter the height
				1.73
				Enter the weight
				70
				The given height and weight bmi 23.39
	 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the height");
	double height=sc.nextDouble();
	System.out.println("Enter the weight");
	int weight=sc.nextInt();
	double bmi=weight/(height*height);
	System.out.printf("The given height and weight bmi "+"%.2f",bmi);
	}

}
