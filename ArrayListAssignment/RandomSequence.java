package arraylistAssignment;

import java.util.ArrayList;

public class RandomSequence {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(12);
        number.add(2);
        number.add(23);
        number.add(129);
        number.add(121);
        long start=System.nanoTime();
        for(int i=0;i<number.size();i++)
        {
            int value=number.get(i);
        }
        long end=System.nanoTime();
        System.out.println("FOR LOOP:"+(end-start));
        start=System.nanoTime();
        for(Integer i:number)
        {
            int value=i;
        }
        end=System.nanoTime();
        System.out.println("FOR EACH LOOP:"+(end-start));
    }
}
