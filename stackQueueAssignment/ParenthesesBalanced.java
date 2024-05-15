package stackQueueAssignment;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesBalanced {
	public boolean isBalanced(String str)
	{
		Stack<Character> list=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==')'&&!(list.peek()=='(')||str.charAt(i)==']'&&!(list.peek()=='[')||str.charAt(i)=='}'&&!(list.peek()=='{'))
			{
				return false;
			}
			else if(str.charAt(i)=='('||str.charAt(i)=='['||(str.charAt(i)=='{'))
					list.push(str.charAt(i));
			else
				list.pop();
		}
		return list.isEmpty();
		
	}

	public static void main(String[] args) {
		ParenthesesBalanced obj=new ParenthesesBalanced();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(obj.isBalanced(str));
	}

}
