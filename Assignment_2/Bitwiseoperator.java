package Assignment_2;
import java.util.Scanner;
public class Bitwiseoperator {
	/*
	 * sample output:-
	 * 			Enter the number 1:
				10
				Enter the number 2:
				10
				AND operator:		10
				OR operator:		10
				XOR operator:		0
				Left shift operator:10240
				Right shift operator:0
				Complement operator:-11
	 */

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 	
	System.out.println("Enter the number 1:");
	int num1=sc.nextInt();
	System.out.println("Enter the number 2:");
	int num2=sc.nextInt();
	System.out.println("AND operator:"+(num1&num2));
	System.out.println("OR operator:"+(num1|num2));
	System.out.println("XOR operator:"+(num1^num2));
	System.out.println("Left shift operator:"+(num1<<num2));
	System.out.println("Right shift operator:"+(num1>>num2));
	System.out.println("Complement operator:"+(~num1));
	}

}
