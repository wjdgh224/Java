package practice4;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work==null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}

}

class MonthSchedule {
	Scanner scanner = new Scanner(System.in);
	private int day;
	Day d []; //��ü ���� �� ����?
	
	MonthSchedule(int day) {
		this.day = day;
		d = new Day[day];
		for(int i=0; i<day; i++)
			d[i] = new Day();
	}
	void input() {
		System.out.print("��¥(1~" + day +")?");
		int input = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		d[input].set(work);
		System.out.println();
	}
	void view() {
		System.out.print("��¥(1~" + day +")?");
		int input = scanner.nextInt();
		System.out.print(input + "���� �� ���� ");
		d[input].show();
		System.out.println();
	}
	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	void run() {
		System.out.println("�̹��� ���� ���α׷�.");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int input = scanner.nextInt();
			if(input == 1)
				input();
			else if(input == 2)
				view();
			else
				finish();
		}
	}
}

public class ex7 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}

}
