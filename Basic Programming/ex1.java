package practice;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = scanner.nextInt();
		System.out.print(money + "���� $" + money/1100. +"�Դϴ�.");
		scanner.close();
	}

}
