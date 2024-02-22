package Assignment_3;
import java.util.Scanner;
public class Correspondinggrade {
	/*
	 * Sample output
	 * 			Enter the score
				87
				Grade : A
	 */
	public String findgrade(int score)
	{
		if(100>=score&&score>=85)
			return "A";
		else if(score<85&&score>=75)
			return "B";
		else if(score<75&&score>=50)
			return "c";
		else if(score<50&&score>=35)
			return "D";
		else if(35>score&&score>0)
		return "Fail";
	return "Invalid score";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score");
		int score=sc.nextInt();
		Correspondinggrade obj=new Correspondinggrade();
		System.out.println("Grade : "+obj.findgrade(score));
	}

}
