package practice6;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String []s = {"����", "����", "��" };
		while(true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			int chul = scanner.nextInt();
			if(chul==4)
				break;
			int com = (int)(Math.random()*3+1);
			System.out.println("ö��(" + s[chul-1] + ") : ��ǻ��(" + s[com-1] + ")");
			if(chul==com)
				System.out.println("�����ϴ�.");
			else if(chul==1) {
				if(com==2)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("ö���� �̰���ϴ�.");
			}
			else if(chul==2) {
				if(com==3)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("ö���� �̰���ϴ�.");
			}
			else {
				if(com==1)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("ö���� �̰���ϴ�.");
			}
			
		}
		
		scanner.close();
	}

}
