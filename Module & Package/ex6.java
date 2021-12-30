package practice6;
import java.util.Scanner;
import java.util.Calendar;

public class ex6 {
	static Scanner scanner = new Scanner(System.in);
	public static void  game() {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		String [] name = {"황기태", "이재문"};
		int [] result = new int[2];
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " 시작 <Enter>키>>");
			String enter = scanner.nextLine();
			int first=0, second=0;
			if(enter.equals("")) {
				Calendar a = Calendar.getInstance();
				first = a.get(Calendar.SECOND);
				System.out.println("	현재 초 시간 = " + first);
			}
			System.out.print("10초 예상 후 <Enter>키>>");
			enter = scanner.nextLine();
			if(enter.equals("")) {
				Calendar b = Calendar.getInstance();
				second = b.get(Calendar.SECOND);
				System.out.println("	현재 초 시간 = " + second);
			}
			int diff = second - first;
			if(diff>=0) {
				result[i] = diff;
			}
			else
				result[i] = diff+60;
		}
		System.out.print("황기태의 결과 " + result[0] + ", 이재문의 결과 " + result[1] + ", 승자는 ");
		if(Math.abs(10-result[0])>Math.abs(10-result[1]))
			System.out.println("이재문");
		else
			System.out.println("황기태");
	}
	public static void main(String[] args) {
		game();

	}

}
