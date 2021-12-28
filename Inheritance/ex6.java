package practice5;

class Point4 {
	private int x, y;
	public Point4(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint4 extends Point4 {
	private String color;
	ColorPoint4() {
		super(0 ,0);
		this.color = "BLACK";
	}
	ColorPoint4(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	void setXY(int x, int y) {
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color +  "색의 (" + getX() + "," + getY() + ")의 ";
	}
}

public class ex6 {

	public static void main(String[] args) {
		ColorPoint4 zeroPoint = new ColorPoint4();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint4 cp = new ColorPoint4(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
