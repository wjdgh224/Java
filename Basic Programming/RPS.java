package practice;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String chul = scanner.next();
		System.out.print("���� >> ");
		String young = scanner.next();
		if(chul.equals(young))
			System.out.println("�����ϴ�.");
		else if(chul.equals("����")) {
			if(young.equals("����"))
				System.out.print("ö���� �̰���ϴ�.");
			else
				System.out.print("���� �̰���ϴ�.");
		}
		else if(chul.equals("����")) {
			if(young.equals("����"))
				System.out.print("���� �̰���ϴ�.");
			else
				System.out.print("ö���� �̰���ϴ�.");
		}
		else {
			if(young.equals("����"))
				System.out.print("ö���� �̰���ϴ�.");
			else
				System.out.print("���� �̰���ϴ�.");
		}

		scanner.close();
			
	}

}
