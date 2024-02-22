package Assignment_2;
import java.util.*;
public class Secondtoformat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seconds value");
		int sec=sc.nextInt();
		int hour=sec/3600;
		int min=(sec%3600)/60;
		sec=(sec%3600)%60;
		String time=String.format("%02d:%02d:%02d",hour,min,sec);
		System.out.println("Time format hh:min:sec  "+time);
	}

}
