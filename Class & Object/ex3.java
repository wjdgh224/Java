package practice4;

class Song {
	private String title, artist, country;
	private int year;
	
	Song() {}
	Song(String title, String artist, int year, String country) {
		this.title = title; this.artist = artist;
		this.year = year; this.country = country;
	}
	void show() {
		System.out.println(this.year + "�� " + this.country + "������ " + this.artist + "�� �θ� " + this.title);
	}
}
public class ex3 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();

	}

}
