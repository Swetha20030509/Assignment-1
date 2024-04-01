package exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int array[]=new int[0];
        try
        {
            array[0]=1;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
