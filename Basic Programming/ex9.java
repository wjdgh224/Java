package practice;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("�� �Է�>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
	
		if((x-a)*(x-a)+(y-b)*(y-b) <= r*r)
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		
		scanner.close();
	}

}
