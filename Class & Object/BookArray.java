package practice4;
import java.util.Scanner;

class Book3 {
	String title;
	String author;
	public Book3(String t, String a) {
		this.title = t;
		this.author = a;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book3 [] b = new Book3[2];
		
		for(int i=0; i<b.length; i++) {
			System.out.print("����>>");
			String t = scanner.nextLine();
			System.out.print("����>>");
			String a = scanner.nextLine();
			b[i] = new Book3(t, a);
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.print("(" + b[i].title + ", " + b[i].author + ")");
		}

		scanner.close();
	}

}
