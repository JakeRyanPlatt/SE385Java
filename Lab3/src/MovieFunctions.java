import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieFunctions {

    public static void MovieCheckout(Scanner scanner) {

        String answer;
        List<movieEntry> catalog = new ArrayList<>();

        do {
            catalog.add(enterMovie(scanner));

            System.out.println("Would you like to enter another Movie (Y/N)?");
            answer = scanner.next();
            scanner.nextLine(); // clear buffer

        } while (answer.equalsIgnoreCase("Y"));

        displayCatalog(catalog);
    }

    public static movieEntry enterMovie(Scanner scanner) {

        System.out.println("Please enter the Title of the movie:");
        String movieTitle = scanner.nextLine();

        System.out.println("Please enter the director:");
        String directorName = scanner.nextLine();

        System.out.println("Please enter the release year:");
        int releaseYear = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.println("Please enter the Genre of the movie:");
        String movieGenre = scanner.nextLine();

        return new movieEntry(movieTitle, directorName, releaseYear, movieGenre);
    }

    public static void displayCatalog(List<movieEntry> catalog) {

        System.out.println("\n===== Movie Catalog =====");

        for (movieEntry movie : catalog) {
            System.out.println("----------------------------");
            System.out.println("Title   : " + movie.movieTitle);
            System.out.println("Director: " + movie.directorName);
            System.out.println("Year    : " + movie.releaseYear);
            System.out.println("Genre   : " + movie.movieGenre);
        }

        System.out.println("----------------------------");
    }
}