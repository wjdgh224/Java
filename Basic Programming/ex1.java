package practice;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = scanner.nextInt();
		System.out.print(money + "원은 $" + money/1100. +"입니다.");
		scanner.close();
	}

}
