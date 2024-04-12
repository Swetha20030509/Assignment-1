package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Circular
{
    ArrayList<String> allMessage=new ArrayList<>();
    int size=5;
    int current=0;
    public void addMessage(String message)
    {
        if(size>current)
        {
            allMessage.add(message);
            current++;
        }
        else {
            allMessage.set(current%size,message);
            current++;
        }
    }
}

public class CircularBuffer {

    public static void main(String[] args) {
        Circular circular=new Circular();
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add Message");
            System.out.println("2.Display message");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            String choice=scanner.nextLine();
            switch(choice)
            {
                case "1":
                    System.out.println("Enter your message");
                    String message=scanner.nextLine();
                    circular.addMessage(message);
                    break;
                case "2":
                    System.out.println("message display");
                    System.out.println(Arrays.toString(circular.allMessage.toArray()));
                    break;
                case "3":
                    System.exit(0);
            }
        }

    }
}
