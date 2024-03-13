package Assignment_8;
import java.util.*;
public class GenarateTrain {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");
     String str= sc.nextLine();
     int value=str.length()/2;
     String result="";
     for(int i=0;i<str.length();i++)
     {
         for(int j=0;j<=value;j++)
         {
          result+=str.charAt(i);
         }
         if(i>=str.length()/2)
         {
             value++;
         }
         else {
             value--;
         }
     }
        System.out.println(result);
    }
}
