package exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        ArithmeticExceptionDemo arithmeticExceptionDemo=new ArithmeticExceptionDemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        arithmeticExceptionDemo.divide(num);
    }

    private void divide(int num) {
        try
        {
            System.out.println(num/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
