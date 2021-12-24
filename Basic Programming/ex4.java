package practice;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		if(x>y) {
			if(z>x)
				System.out.println("중간 값은 " + x);
			else {
				if(y>z)
					System.out.println("중간 값은 " + y);
				else 
					System.out.println("중간 값은 " + z);
			}
		}
		else {
			if(z>y)
				System.out.println("중간 값은 " + y);
			else {
				if(x>z)
					System.out.println("중간 값은 " + x);
				else 
					System.out.println("중간 값은 " + z);
			}
		}
		scanner.close();
	}

}
