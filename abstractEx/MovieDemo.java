package abstractEx;
abstract class Movie
{
    String title;
    int duration;
    int totalBookingCount;
    double price;
    Movie(String movieName, int duration, int price, int totalBookCount)
    {
        this.title=movieName;
        this.duration=duration;
        this.price=price;
        this.totalBookingCount=totalBookCount;
    }
    public abstract double calculateAmount();
}
class ActionMovie extends Movie
{
    public ActionMovie(String movieName, int duration, int price, int totalBookCount) {
        super(movieName,duration,price,totalBookCount);
    }

    public double calculateAmount()
    {
        System.out.println(title+" Total booking amount");
        return price*totalBookingCount;
    }
}
class ComedyMovie extends Movie
{
    public ComedyMovie(String movieName, int duration, int price, int totalBookCount) {
        super(movieName,duration,price,totalBookCount);
    }

    public double calculateAmount()
    {
        System.out.println(title+" Total booking amount");
        return price*totalBookingCount;
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Movie movie=new ActionMovie("Beast",2,100,400);
        System.out.println(movie.calculateAmount());
        Movie movie1=new ComedyMovie("Remo",2,100,300);
        System.out.println(movie1.calculateAmount());
    }
}
