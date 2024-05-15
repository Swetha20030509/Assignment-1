package stackQueueAssignment;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public void changeToPostfixI(String str)
	{
		String result="";
		Stack<Character> operator=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				result+=str.charAt(i);
			}
			else 
			{
				if(operator.isEmpty())
				{
					operator.push(str.charAt(i));
				}
				else
				{
				int first=find(str.charAt(i));
				int second=find(operator.peek());
				if(first<second)
				{
					result+=operator.pop();
				}
				operator.push(str.charAt(i));
				}
			}
		}
		while(!operator.isEmpty())
		{
			result+=operator.pop();
		}
		System.out.println("postfix :"+result);
	}
	public int find(char operator)
	{
		if(operator=='+')
			return 1;
		else if(operator=='-')
			return 1;
		else if(operator=='*')
			return 2;
		else if(operator=='/')
			return 2;
	return 3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InfixToPostfix obj=new InfixToPostfix();
		System.out.println("Enter the string");
		String str=sc.nextLine();
		obj.changeToPostfixI(str);
	}

}
