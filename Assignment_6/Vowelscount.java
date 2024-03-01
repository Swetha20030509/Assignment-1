package Assignment_6;
import java.util.*;
public class Vowelscount {

	public void count(String str)
	{
		String vowels="aeiouAEIOU";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(vowels.contains(str.substring(i, i+1)))
			{
				count++;
			}
		}
		System.out.println("Vowels count :"+count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vowelscount obj=new Vowelscount();
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		obj.count(str1);
	}

}
