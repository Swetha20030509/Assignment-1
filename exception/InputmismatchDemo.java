package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputmismatchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the phone Number");
        try {
            long phoneNumber = sc.nextLong();
            System.out.println("phone number is correct");
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }

    }
}
