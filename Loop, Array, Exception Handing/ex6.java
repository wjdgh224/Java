package practice3;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		int count;
		for(int i=0; i<unit.length; i++) {
			count = money/unit[i];
			money = money%unit[i];
			if(count>0)
				System.out.println(unit[i] + "�� ¥�� : " + count + "��");
		}
		
		scanner.close();
	}

}
