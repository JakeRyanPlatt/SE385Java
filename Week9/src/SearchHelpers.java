import java.util.ArrayList;
import java.util.List;

public class SearchHelpers {
	public static List<Movie> search(List<Movie> movies,String choice,String criteria){
		List<Movie> foundMovies = new ArrayList<>();
		switch(choice) {
		case "1":
			return foundMovies = searchByTitle(movies,criteria);
		case "2":
			return foundMovies = searchByGenre(movies,criteria);
		case "3":
			return foundMovies = searchByDirectorLastName(movies,criteria);
		case "4":
			return foundMovies = searchByReleaseYear(movies,criteria);
		default:
			return foundMovies;
		}
	}
			
	private static List<Movie> searchByTitle(List<Movie> movieList, String criteria){
		List<Movie> foundMovies = new ArrayList<>();
		for (Movie movie: movieList) {
			if(movie.getTitle().toLowerCase().contains(criteria)) {
				foundMovies.add(movie);
			}
		}
			return foundMovies;
		}

		
	private static List<Movie> searchByGenre(List<Movie> movieList, String criteria){
	List<Movie> foundMovies = new ArrayList<>();
		for (Movie movie: movieList) {
			if(movie.getGenre().toLowerCase().contains(criteria)) {
				foundMovies.add(movie);
			}
		}
			return foundMovies;
		}
		
	private static List<Movie> searchByDirectorLastName(List<Movie> movieList, String criteria) {
	List<Movie> foundMovies = new ArrayList<>();
		for (Movie movie: movieList) {
			if(movie.getDirectorLastName().toLowerCase().contains(criteria)) {
				foundMovies.add(movie);
				}
		}
			return foundMovies;
		}
	private static List<Movie> searchByReleaseYear(List<Movie> movieList, String criteria){
	List<Movie> foundMovies = new ArrayList<>();
		for (Movie movie: movieList) {
			if(movie.getReleaseYear().toLowerCase().contains(criteria)) {
				foundMovies.add(movie);
			}
		}
			return foundMovies;
		}
	}

 