package practice5;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	int getColor() { return color; }
	void printProperty() {
		System.out.println(getSize() + "��ġ " + getColor() + "�÷�");
	}
}

public class ex1 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}

}
