package practice;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		if((x+y)>z && (y+z)>x && (z+x)>y)
			System.out.println("�ﰢ���� �˴ϴ�");
		scanner.close();
	}

}
