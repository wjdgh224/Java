package practice3;
import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend = scanner.nextInt();
			System.out.print("�������� �Է��Ͻÿ�:");
			int divisor = scanner.nextInt();
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		
		scanner.close();

	}

}
