package practice3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				//scanner.nextLine();
				continue;
			}
			break;
		}
		
		scanner.close();
	}

}
