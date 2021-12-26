package practice4;

import java.util.Scanner;

class Booking {
	Scanner scanner = new Scanner(System.in);
	String tag[] = {"S", "A", "B" };
	String seats[][] = {{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
					{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
					{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}};
	void book() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int seat = scanner.nextInt();
		System.out.print(tag[seat-1] + ">> ");
		for(int i=0; i<10; i++)
			System.out.print(seats[seat-1][i] + " ");
		System.out.println();
		System.out.print("이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
		int num = scanner.nextInt();
		seats[seat-1][num-1] = name;
	}
	void check() {
		for(int i=0; i<3; i++) {
			System.out.print(tag[i] + ">> ");
			for(int j=0; j<10; j++)
				System.out.print(seats[i][j] + " ");
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		System.out.print("좌석 S(1), A(2), B(3)>>");
		int seat = scanner.nextInt();
		System.out.print(tag[seat-1] + ">> ");
		for(int i=0; i<10; i++) {
			System.out.print(seats[seat-1][i]);
		}
		System.out.println();
		System.out.print("이름>>");
		String name = scanner.next();
		for(int i=0; i<10; i++) {
			if(name.equals(seats[seat-1][i]))
				seats[seat-1][i] = "---";
		}
	}
}

public class ex12 {
	Scanner scanner = new Scanner(System.in);
	void run() {
		Booking b = new Booking();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int in = scanner.nextInt();
			if(in==1)
				b.book();
			else if(in==2)
				b.check();
			else if(in==3)
				b.cancel();
			else
				break;
		}
	}

	public static void main(String[] args) {
		ex12 e = new ex12();
		e.run();

	}

}
