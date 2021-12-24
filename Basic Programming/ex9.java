package practice;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("점 입력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
	
		if((x-a)*(x-a)+(y-b)*(y-b) <= r*r)
			System.out.println("점 (" + x + "," + y + ")는 원 안에 있다.");
		
		scanner.close();
	}

}
