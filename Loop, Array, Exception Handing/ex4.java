package practice3;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		char a = scanner.next().charAt(0);
		
		for(char i = 0; i<=a-'a'; i++) {
			for(char j='a'; j<=a-i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		scanner.close();
	}

}
