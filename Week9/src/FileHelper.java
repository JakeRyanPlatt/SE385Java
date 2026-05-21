import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

	public static List<Movie> createMovieList(String filePath) {
		List<Movie> movies = new ArrayList<>();
		String line;
		String splitBy = ",";
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			while((line = br.readLine()) != null) {
				String[] data = line.split(splitBy);
				String title = data[0];
				String releaseYear = data[1];
				String genre = data[2];
				String directorFirstName = data[3];
				String directorLastName = data[4];
				movies.add(new Movie(title, releaseYear, genre, directorFirstName, directorLastName));
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return movies;
	}
}
