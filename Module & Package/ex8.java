package practice6;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String s = scanner.nextLine();//String�� �迭�� ����X
		for(int i=0; i<s.length(); i++) {
			s = s.substring(1) + s.charAt(0);
			System.out.println(s);
		}
		scanner.close();
	}

}
