package Assignment10;
abstract class Vechile
{
    String brand;
    int year;
    String color;

    public Vechile(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    abstract  void speed();

}
class Car extends Vechile
{
    public Car(String brand, int year, String color) {
        super(brand, year, color);
    }

    public void speed()
    {
        System.out.println("The speed is :"+"12km/hr");
    }
}
class Bike extends Vechile
{
    public Bike(String brand, int year, String color) {
        super(brand, year, color);
    }

    public  void speed()
    {
        System.out.println("The speed is :"+"12km/hr");
    }
}
public class VechileDemo {
    public static void main(String[] args) {
        Vechile vechile=new Car("innova",2000,"blue") ;
        Vechile vechile1=new Bike("royal",1990,"black");
    }
}
