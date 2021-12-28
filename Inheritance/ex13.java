package practice5;

interface Shape3 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle3 implements Shape3 {
	private int radius;
	Circle3(int radius) {
		this.radius = radius;
	}
	int getRadius() {
		return this.radius;
	}
	public void draw() {
		System.out.println("반지름이 " + getRadius() + "인 원입니다.");
	}
	public double getArea() {
		return 3.14*getRadius()*getRadius();
	}
}

public class ex13 {

	public static void main(String[] args) {
		Shape3 donut = new Circle3(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}
