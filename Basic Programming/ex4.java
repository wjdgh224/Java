package practice;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		if(x>y) {
			if(z>x)
				System.out.println("�߰� ���� " + x);
			else {
				if(y>z)
					System.out.println("�߰� ���� " + y);
				else 
					System.out.println("�߰� ���� " + z);
			}
		}
		else {
			if(z>y)
				System.out.println("�߰� ���� " + y);
			else {
				if(x>z)
					System.out.println("�߰� ���� " + x);
				else 
					System.out.println("�߰� ���� " + z);
			}
		}
		scanner.close();
	}

}
