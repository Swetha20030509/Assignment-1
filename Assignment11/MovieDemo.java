package Assignment11;

abstract class Movie
{
    String movieName;
    int releaseYear;
    String director;
    String language;

    public Movie(String movieName, int releaseYear, String director, String language) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.director = director;
        this.language = language;
    }
    abstract public void displayDetail();
}
class RomComMovie extends Movie
{
    String leadActor;
    String leadActors;

    public RomComMovie(String movieName, int releaseYear, String director, String language, String leadActor, String leadActors) {
        super(movieName, releaseYear, director, language);
        this.leadActor = leadActor;
        this.leadActors = leadActors;
    }

    @Override
    public void displayDetail() {
        System.out.println("Movie Name"+movieName);
        System.out.println("Director Name"+director);
        System.out.println("Language "+language);
        System.out.println("Actor : "+leadActor);
        System.out.println("Actors : "+leadActors);
    }
}
class ThrillerMovie extends Movie
{
    String mainCharacter;

    public ThrillerMovie(String movieName, int releaseYear, String director, String language, String mainCharacter) {
        super(movieName, releaseYear, director, language);
        this.mainCharacter = mainCharacter;
    }

    @Override
    public void displayDetail() {
        System.out.println("Movie Name"+movieName);
        System.out.println("Director Name"+director);
        System.out.println("Language "+language);
        System.out.println("MainActor : "+mainCharacter);
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Movie newMovie=new RomComMovie("Remo",2010,"aa","Tamil","siva","keerthi");
        newMovie.displayDetail();
        Movie newMovie1=new ThrillerMovie("kachana",2010,"aaa","Tamil","siva");
        newMovie1.displayDetail();
    }
}
