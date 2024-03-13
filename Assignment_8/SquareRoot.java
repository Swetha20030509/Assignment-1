package Assignment_8;
import java.util.*;
public class SquareRoot {
    public int squareRoot(int value)
    {
            int i=0;
            int j=value;
            int mid=(i+j)/2;
            long mul=mid*mid;
            while(i<=j)
            {
                if(value==mul)
                {
                    return mid;
                }
                else if(value<mul)
                {
                    j=mid-1;
                }
                else if(value>mul)
                {
                    i=mid+1;
                }
                mid=(i+j)/2;
                mul=mid*mid;
            }

            return (value-mid*mid)<((mid+1)*(mid+1)-value)? mid:mid+1;}
    public static void main(String[] args) {
        SquareRoot obj=new SquareRoot();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int value= sc.nextInt();
        System.out.println(obj.squareRoot(value));
    }
}
