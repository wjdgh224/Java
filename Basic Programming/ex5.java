package practice;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		if((x+y)>z && (y+z)>x && (z+x)>y)
			System.out.println("삼각형이 됩니다");
		scanner.close();
	}

}
