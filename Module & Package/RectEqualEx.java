package practice6;

class Rect {
	int width, height;
	Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(r.width*r.height==width*height) return true;
		else return false;
	}
}

public class RectEqualEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");

	}

}
