package Assignment_6;
import java.util.*;
public class EmailVerify {
	public void verify(String Email)
	{
		int count=0;
		int alphatcount=0;
		int numbercount=0;
		boolean flag=false;
		if(Email.substring(Email.length()-4,Email.length()).equals(".com")&&(Email.charAt(0)>='a'&&Email.charAt(0)<='z'||Email.charAt(0)>='0'&&Email.charAt(0)<='9'))
		{
			flag=true;
		for(int i=0;i<Email.length();i++)
		{
			if(i>0&&Email.charAt(i)=='@'&&((Email.charAt(i-1)>='a'&&Email.charAt(i-1)<='z')||(Email.charAt(i-1)>='0'&&Email.charAt(i-1)<='9'))&&((Email.charAt(i+1)>='a'&&Email.charAt(i+1)<='z')||(Email.charAt(i+1)>='0'&&Email.charAt(i+1)<='9')))
			{
				count++;
			}
			else if(Email.charAt(i)>='a'&&Email.charAt(i)<='z')
			{
				alphatcount++;
			}
			else if(Email.charAt(i)>='0'&&Email.charAt(i)<='9')
			{
				numbercount++;
			}
			else if(Email.charAt(i)=='.'&&(!(Email.charAt(i)>='a'&&Email.charAt(i)<='z'))||Email.charAt(i)=='-'&&(!(Email.charAt(i)>='a'&&Email.charAt(i)<='z'))||Email.charAt(i)=='_'&&((!(Email.charAt(i)>='a'&&Email.charAt(i)<='z'))))
			{
				flag=false;
			}
		}
		if(count==1&&flag&&alphatcount>1)
		{
			System.out.println("Email is Valid");
		}
		else
		{
			System.out.println("Email is Invalid");
		}
	}
		else
		{
			System.out.println("Email is Invalid1");
		}
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Email id");
	String str1=sc.nextLine();
	EmailVerify obj=new EmailVerify();
	obj.verify(str1);
	}

}
