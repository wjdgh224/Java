package practice4;

class TV {
	private String name;
	private int year;
	private int inch;
	TV(String name , int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(this.name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}

public class ex1 {

	public static void main(String[] args) {
		TV myTV =new TV("LG", 2017, 32);
		myTV.show();

	}

}
