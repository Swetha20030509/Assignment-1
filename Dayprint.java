package Assignment_1;
import java.util.Scanner;
/*
 * Enter the number
	0
	Day:Sunday
 */
enum Days
{
	Sunday,Monday,Thuesday,Wednesday,Thesday,Friday,Saturday;
}
public class Dayprint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println(Days.values()[number]);
	}

}
