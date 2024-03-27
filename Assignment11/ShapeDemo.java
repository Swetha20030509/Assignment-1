package Assignment11;

abstract class shape{
    abstract double area();
    abstract double perimeter();
}
class Circle
{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle
{
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area()
    {
        return height*width;
    }
    public double perimeter()
    {
        return 2+(height+width);
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,30);
        System.out.println("Rectangle Area :"+rectangle.area());
        System.out.println("Rectangle perimeter"+rectangle.perimeter());
        Circle circle=new Circle(10);
        System.out.println("Circle Area :"+rectangle.area());
        System.out.println("Circle perimeter"+rectangle.perimeter());
    }
}

