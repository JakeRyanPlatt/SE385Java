
public class Movie {
	String title;
	String releaseYear;
	String genre;
	String directorFirstName;
	String directorLastName;
	public Movie(String title, String releaseYear, String genre, String directorFirstName, String directorLastName) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.directorFirstName = directorFirstName;
		this.directorLastName = directorLastName;
	}
	public String getTitle() {
		return title;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public String getGenre() {
		return genre;
	}
	public String getDirectorFirstName() {
		return directorFirstName;
	}
	public String getDirectorLastName() {
		return directorLastName;
	}
	
	
}
