package practice3;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str [] = {"����", "����", "��" };
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String usr = scanner.next();
			String com = str[(int)(Math.random()*3)];
			if(usr.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			System.out.print("����� = " + usr + " , ��ǻ�� = " + com + ", ");
			if(usr.equals(com))
				System.out.println("�����ϴ�.");
			else if(usr.equals("����")) {
				if(com.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			else if(usr.equals("����")) {
				if(com.equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			else
				if(com.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����ڰ� �̰���ϴ�.");
		}
		
		scanner.close();
	}
}

