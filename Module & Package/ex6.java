package practice6;
import java.util.Scanner;
import java.util.Calendar;

public class ex6 {
	static Scanner scanner = new Scanner(System.in);
	public static void  game() {
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		String [] name = {"Ȳ����", "���繮"};
		int [] result = new int[2];
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ���� <Enter>Ű>>");
			String enter = scanner.nextLine();
			int first=0, second=0;
			if(enter.equals("")) {
				Calendar a = Calendar.getInstance();
				first = a.get(Calendar.SECOND);
				System.out.println("	���� �� �ð� = " + first);
			}
			System.out.print("10�� ���� �� <Enter>Ű>>");
			enter = scanner.nextLine();
			if(enter.equals("")) {
				Calendar b = Calendar.getInstance();
				second = b.get(Calendar.SECOND);
				System.out.println("	���� �� �ð� = " + second);
			}
			int diff = second - first;
			if(diff>=0) {
				result[i] = diff;
			}
			else
				result[i] = diff+60;
		}
		System.out.print("Ȳ������ ��� " + result[0] + ", ���繮�� ��� " + result[1] + ", ���ڴ� ");
		if(Math.abs(10-result[0])>Math.abs(10-result[1]))
			System.out.println("���繮");
		else
			System.out.println("Ȳ����");
	}
	public static void main(String[] args) {
		game();

	}

}
