package practice4;

class Rectangle2 {
	int x, y, width, height;
	Rectangle2(int x, int y, int width, int height) {
		this.x = x; this.y = y; this.width = width; this.height = height;
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("(" + this.x + "," + this.y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	boolean contains(Rectangle2 r) {
		if(r.x>this.x && r.x+r.width<this.x+this.width && r.y>this.y && r.y+r.height<this.y+this.height)
			return true;
		else
			return false;
	}
}

public class ex4 {

	public static void main(String[] args) {
		Rectangle2 r = new Rectangle2(2, 2, 8, 7);
		Rectangle2 s = new Rectangle2(5, 5, 6, 6);
		Rectangle2 t = new Rectangle2(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
