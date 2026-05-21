import java.text.MessageFormat;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filePath = "/home/momtookmycomputer/eclipse-workspace/Week9/src/Movies.csv";
		List<Movie> movies = FileHelper.createMovieList(filePath);
		String menu;
		do {

		System.out.println("How would you like to search for movies?"
				+ "\n1.Title"
				+ "\n2.Genre"
				+ "\n3.Directors Last Name"
				+ "\n4.Release Year");
		String choice = scanner.nextLine();
		System.out.println("What is your search criteria?");
		String criteria = scanner.nextLine();
		List<Movie> foundMovies = SearchHelpers.search(movies, choice, criteria);
		for (Movie movie: foundMovies) {
			print(movie);
		}
		System.out.println("Would you like to make another search? Y/N");
		menu = scanner.nextLine();
		
		 
	} while(!menu.equalsIgnoreCase("N"));
		scanner.close();
	}
	private static void print(Movie movie) {
		System.out.println("--------------------------------");
		System.out.println(MessageFormat.format("Movie Title: {0}"
		+ "\nReleaseYear: {1}"
		+ "\nGenre: {2}"
		+ "\nDirector: {3} {4}",
		 movie.title,
		 movie.releaseYear,
		 movie.genre,
		 movie.directorFirstName,
		 movie.directorLastName));
	}
}

