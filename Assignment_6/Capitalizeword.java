package Assignment_6;
import java.util.*;
public class Capitalizeword {
	public void EachWordcaptial(String sen)
	{
		String split[]=sen.split(" ");
		String result="";
		for(int i=0;i<split.length;i++)
		{
			result+=split[i].substring(0,1).toUpperCase()+split[i].substring(1,split[i].length())+" ";
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentance");
		String sen=sc.nextLine();
		Capitalizeword obj=new Capitalizeword();
		obj.EachWordcaptial(sen);
	}

}
