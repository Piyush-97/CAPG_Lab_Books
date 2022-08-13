package lab2;

public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD() {
	}

	public CD(String artist, String genre) {
		setArtist(artist);
		setGenre(genre);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		if (artist instanceof String) {
			this.artist = artist;
		} else {
			System.out.println("Wrong data type for Artist.");
		}
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
