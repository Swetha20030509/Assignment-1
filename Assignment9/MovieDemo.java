package Assignment9;

import java.util.Scanner;

class Movie
{
    private static String theatureName="XYZ theature";
    private String movieName;
    private int releaseYear;
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public static String getTheatureName() {
        return theatureName;
    }

    public String getDirector() {
        return director;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Movie movie=new Movie();
        System.out.println("*********Movie Detail********");
        System.out.println("Enter the movie name");
        String movieName= sc.nextLine();
        movie.setMovieName(movieName);
        System.out.println("Enter the release year");
        int release= sc.nextInt();
        movie.setReleaseYear(release);
        System.out.println("Enter the director name");
        String directorName= sc.nextLine();
        movie.setDirector(directorName);
        System.out.println("**********Movie Detail Display***********");
       // System.out.println("Theature Name:"+movie.g);
        System.out.println("Movie Name :"+movie.getMovieName());
        System.out.println("Director Name :"+movie.getDirector());
        System.out.println("Release year :"+movie.getReleaseYear());
    }
}
