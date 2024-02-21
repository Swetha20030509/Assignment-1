package Assignment_1;
import java.util.*;
/*
 * This program four class file create
 * 			1.Human
 * 			2.student
 * 			3.employee
 * 			4.Multipleclass
 */
/*class Human
{
	String name;
	String age;
}
class student extends Human 
{
	int rollno;
}
class employee extends Human 
{
	int id;
}*/

public class Multipleclass {
	public static void two2() {
		//[3, 1, 4, 1, 16, 99, 0]
		List<Integer> nums=new ArrayList<>();
		nums.add(3);
		nums.add(1);
		nums.add(4);
		nums.add(1);
		nums.add(6);
		nums.add(99);
		nums.add(0);
		  for(int i=0;i<nums.size();i++)
		  {
			  int mod=(nums.get(i)*2)%10;
			  
		    if(mod==2)
		    {
		    	 System.out.println("-88786-"+nums.toString()+"..."+i);
		      nums.remove(i);
		      System.out.println("---"+nums.toString());
		      System.out.println(nums.get(i)+"sssss"+i);
		      i--;
		      System.out.println(nums.get(i)+"********"+i);
		    }
		    else
		    {
		    	 System.out.println("...."+nums.toString());
		      nums.set(i,(nums.get(i)*2));
		    }
		  }
		  System.out.println(nums.toString());
		}
	public static void main(String[] args) {
		System.out.println(".....");
		Math.random();
		two2();
	}

}
