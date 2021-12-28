package practice5;

interface Shape3 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
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
		System.out.println("�������� " + getRadius() + "�� ���Դϴ�.");
	}
	public double getArea() {
		return 3.14*getRadius()*getRadius();
	}
}

public class ex13 {

	public static void main(String[] args) {
		Shape3 donut = new Circle3(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());

	}

}
