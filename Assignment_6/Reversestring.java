package Assignment_6;
import java.util.*;
public class Reversestring {

	public void reverse(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println("The reverse String :"+rev);
	}
	public static void main(String[] args) {
		Reversestring obj=new Reversestring();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	obj.reverse(str);
	

	}

}
