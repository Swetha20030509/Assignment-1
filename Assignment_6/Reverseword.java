package Assignment_6;
import java.util.*;
public class Reverseword {

	public void wordReverse(String sen)
	{
		String word[]=sen.split(" ");
		String result="";
		for(int i=word.length-1;i>=0;i--)
		{
			result+=word[i]+" ";
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		Reverseword obj=new Reverseword();
		obj.wordReverse(str);
	}

}
