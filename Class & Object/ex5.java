package practice4;
import java.util.Scanner;

class Circle4 {
	private double x, y;
	private int radius;
	public Circle4(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
	}
}

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle4 c [] = new Circle4[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle4(x, y, radius);
		}
		for(int i=0; i<c.length; i++) c[i].show();
		scanner.close();
	}

}
