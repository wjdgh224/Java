package practice;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		double x = scanner.nextDouble();
		String op = scanner.next();
		double y = scanner.nextDouble();
		double result;
		
		/*if(op.equals("+")) {
			result = x+y;
			System.out.println(x + op + y + "의 계산 결과는 " + result);
			}
		else if(op.equals("-")) {
			result = x-y;
			System.out.println(x + op + y + "의 계산 결과는 " + result);
			}
		else if(op.equals("*")) {
			result = x*y;
			System.out.println(x + op + y + "의 계산 결과는 " + result);
			}
		else {
			result = x/y;
			if(y==0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(x + op + y + "의 계산 결과는 " + result);
		}
		*/
		
		switch(op) {
			case "+":
				result = x+y;
				System.out.println(x + op + y + "의 계산 결과는 " + result);
				break;
			case "-":
				result = x-y;
				System.out.println(x + op + y + "의 계산 결과는 " + result);
				break;
			case "*":
				result = x*y;
				System.out.println(x + op + y + "의 계산 결과는 " + result);
				break;
			default:
				result = x/y;
				if(y==0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.println(x + op + y + "의 계산 결과는 " + result);
				break;
			
		}
		
		scanner.close();
	}

}
