package practice;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		System.out.println("�������� " + money/50000 + "��");
		System.out.println("������ " + money%50000/10000 + "��");
		System.out.println("õ���� " + money%50000%10000/1000 + "��");
		System.out.println("��� " + money%50000%10000%1000/100 + "��");
		System.out.println("���ʿ� " + money%50000%10000%1000%100/50 + "��");
		System.out.println("�ʿ� " + money%50000%10000%1000%100%50/10 + "��");
		System.out.println("�Ͽ� " + money%50000%10000%1000%100%50%10 + "��");
		scanner.close();
	}

}
