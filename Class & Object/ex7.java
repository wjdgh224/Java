package practice4;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}

}

class MonthSchedule {
	Scanner scanner = new Scanner(System.in);
	private int day;
	Day d []; //객체 생성 시 오류?
	
	MonthSchedule(int day) {
		this.day = day;
		d = new Day[day];
		for(int i=0; i<day; i++)
			d[i] = new Day();
	}
	void input() {
		System.out.print("날짜(1~" + day +")?");
		int input = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		d[input].set(work);
		System.out.println();
	}
	void view() {
		System.out.print("날짜(1~" + day +")?");
		int input = scanner.nextInt();
		System.out.print(input + "일의 할 일은 ");
		d[input].show();
		System.out.println();
	}
	void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	void run() {
		System.out.println("이번달 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
