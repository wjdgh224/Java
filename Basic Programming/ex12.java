package practice;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>>");
		double x = scanner.nextDouble();
		String op = scanner.next();
		double y = scanner.nextDouble();
		double result;
		
		/*if(op.equals("+")) {
			result = x+y;
			System.out.println(x + op + y + "�� ��� ����� " + result);
			}
		else if(op.equals("-")) {
			result = x-y;
			System.out.println(x + op + y + "�� ��� ����� " + result);
			}
		else if(op.equals("*")) {
			result = x*y;
			System.out.println(x + op + y + "�� ��� ����� " + result);
			}
		else {
			result = x/y;
			if(y==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(x + op + y + "�� ��� ����� " + result);
		}
		*/
		
		switch(op) {
			case "+":
				result = x+y;
				System.out.println(x + op + y + "�� ��� ����� " + result);
				break;
			case "-":
				result = x-y;
				System.out.println(x + op + y + "�� ��� ����� " + result);
				break;
			case "*":
				result = x*y;
				System.out.println(x + op + y + "�� ��� ����� " + result);
				break;
			default:
				result = x/y;
				if(y==0)
					System.out.println("0���� ���� �� �����ϴ�.");
				else
					System.out.println(x + op + y + "�� ��� ����� " + result);
				break;
			
		}
		
		scanner.close();
	}

}
