package practice5;

interface Shape4 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle4 implements Shape4 {
	private double radius;
	Circle4(double radius) {
		this.radius = radius;
	}
	double getRadius() {
		return this.radius;
	}
	public void draw() {
		System.out.println("반지름이 " + getRadius() + "인 원입니다.");
	}
	public double getArea() {
		return PI*getRadius()*getRadius();
	}
}

class Oval implements Shape4 {
	private int x, y;
	Oval(int x, int y) {
		this.x = x; this.y = y;
	}
	double getX() {
		return this.x;
	}
	double getY() {
		return this.y;
	}
	public void draw() {
		System.out.println(getX() + "x" + getY() + "에 내접하는 타원입니다.");
	}
	public double getArea() {
		return PI*getX()/2*getY()/2;//교재 PI*getX()*getY() 오류??
	}
}

class Rect4 implements Shape4 {
	private int width, height;
	Rect4(int width, int height) {
		this.width = width; this.height = height;
	}
	double getWidth() {
		return this.width;
	}
	double getHeight() {
		return this.height;
	}
	public void draw() {
		System.out.println(getWidth() + "x" + getHeight() + "크기의 사각형 입니다.");
	}
	public double getArea() {
		return getWidth()*getHeight();
	}
}

public class ex14 {

	public static void main(String[] args) {
		Shape4 [] list = new Shape4[3];
		list[0] = new Circle4(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect4(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());

	}

}
