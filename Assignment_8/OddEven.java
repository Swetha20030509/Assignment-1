package Assignment_8;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int number= sc.nextInt();
      while(number>1)
      {
          System.out.print(number+" ");
          if(number%2==0)
          {
              number=number/2;
          }
          else {
              number = (3 * number) + 1;
          }
      }
        System.out.print(number+" ");
    }
}
