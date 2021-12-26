package practice4;
import java.util.Scanner;

class Circle5 {
	private double x, y;
	private int radius;
	public Circle5(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
	}
}

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle5 c [] = new Circle5[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle5(x, y, radius);
		}
		double max = c[0].getArea();
		int index = 0;
		for(int i=1; i<c.length; i++) if(max<c[i].getArea()) index = i;
		System.out.print("가장 면적이 큰 원은 "); c[index].show();
		scanner.close();
	}

}
