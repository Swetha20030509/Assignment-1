package Assignment_8;
import java.util.*;
public class allOffByOne {
    public boolean isOne(int array1[],int array2[],int index)
    {
        if(array1.length-1<index)
            return true;
        if(array1[index]+1!=(array2[index]))
            return false;
        index++;
        return isOne(array1,array2,index);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        allOffByOne obj=new allOffByOne();
        System.out.println("Enter the number size in array 1");
        int size= sc.nextInt();
        int array1[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the number size in array 2");
        size= sc.nextInt();
        int array2[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array2[i]=sc.nextInt();
        }
        if(array1.length==array2.length)
        System.out.println(obj.isOne(array1,array2,0));
        else
            System.out.println("false");
    }
}
