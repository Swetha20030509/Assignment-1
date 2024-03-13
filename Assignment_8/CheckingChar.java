package Assignment_8;
import java.util.Scanner;
public class CheckingChar {
    public boolean checkChar(String str,char search,int index)
    {
        if(str.charAt(index)==search)
        {
            return true;
        }
        else
            return ++index<str.length()&&checkChar(str,search,index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CheckingChar obj=new CheckingChar();
        System.out.println("Enter the String");
        String str= sc.nextLine();
        System.out.println("Enter the character");
        char character1=sc.nextLine().charAt(0);
        System.out.println(obj.checkChar(str,character1,0));
    }
}
