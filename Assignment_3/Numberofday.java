package Assignment_3;
import java.util.Scanner;
public class Numberofday {
	/*
	 * Enter the year
		5647
	Enter the month
	12
	Days :31
	 */
	public int findDay(short year,byte month)
	{
		if(year%4==0&&year%100!=0||year%400==0)
		{	if(month==2)
			return 28;
		}
		else if(month==2)
		{
			return 29;
		}
		if(month%2==0&&month<8)
		{
			return 30;
		}
		else if(month>=8&&month%2==0)
		return 31;
		else if(month%2==1&&month>8)
			return 30;
		return 31;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Numberofday obj=new Numberofday();
		System.out.println("Enter the year");
		short year=sc.nextShort();
		System.out.println("Enter the month");
		byte month=sc.nextByte();
		if(month<13)
		System.out.println("Days :"+obj.findDay(year,month));
		else
		System.out.println("Invalid month");
		
	}

}
