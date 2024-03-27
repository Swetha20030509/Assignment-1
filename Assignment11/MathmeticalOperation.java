package Assignment11;

public class MathmeticalOperation {
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public long add(long a,long b,long c)
    {
        return a+b+c;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        MathmeticalOperation obj=new MathmeticalOperation();
        obj.add(10,20);
    }
}
