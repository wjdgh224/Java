package practice5;

class Point5 {
	private int x, y;
	public Point5(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point5 {
	private int z;
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.z + ")의 점";
	}
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	void moveUp() {
		this.z = this.z + 1;
	}
	void moveDown() {
		
	}
}
public class ex7 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");

		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}

}
