package practice5;

class TV2 {
	private int size;
	public TV2(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV2 extends TV2 {
	private int color;
	ColorTV2(int size, int color) {
		super(size);
		this.color = color;
	}
	int getColor() { return color; }
	void printProperty() {
		System.out.println(getSize() + "인치 " + getColor() + "컬러");
	}
}

class IPTV extends ColorTV2 {
	private String ip;
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	String getIP() { return ip; }
	void printProperty() {
		System.out.println("나의 IPTV는 " + getIP() + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
	}
}

public class ex2 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();

	}

}
