package exception;

import java.util.Scanner;

class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num==18)
        {
            try {
                throw new CustomException("invalid number");
            }
            catch(CustomException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
