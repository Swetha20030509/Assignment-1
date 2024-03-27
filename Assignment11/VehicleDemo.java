package Assignment11;
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

    abstract  void start();
    abstract void stop();

}
class Car extends Vechile
{
    public Car(String brand, int year, String color) {
        super(brand, year, color);
    }

   public void start()
   {
       System.out.println("The car is started");
   }
   public void stop()
   {
       System.out.println("Tne car is stoped");
   }
}
class Bike extends Vechile
{
    public Bike(String brand, int year, String color) {
        super(brand, year, color);
    }

    public void start()
    {
        System.out.println("The Bike is started");
    }
    public void stop()
    {
        System.out.println("Tne Bike is stoped");
    }
}
 class VechileDemo {
    public static void main(String[] args) {
        Vechile vechile=new Car("innova",2000,"blue") ;
        Vechile vechile1=new Bike("royal",1990,"black");
        vechile1.start();
        vechile1.stop();
        vechile.start();
        vechile.stop();
    }
}

