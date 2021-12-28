package practice5;

class Point3 {
	private int x, y;
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint3 extends Point3 {
	private String color;
	ColorPoint3(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	void setXY(int x, int y) {
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color +  "���� (" + getX() + "," + getY() + ")�� ";
	}
}

public class ex5 {

	public static void main(String[] args) {
		ColorPoint3 cp = new ColorPoint3(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");

	}

}
