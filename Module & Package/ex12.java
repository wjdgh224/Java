package practice6;
import java.util.Scanner;

class Person2 {
	private String name;
	Person2(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int num = scanner.nextInt();
		Person2 p[] = new Person2[num];
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1) + "��° ���� �̸�>>");
			String name = scanner.next();
			p[i] = new Person2(name);			
		}
		scanner.nextLine();//�̸� �Է½� ���� enter�� ���ۿ� �����ؼ� enter�� ������ �� �ִ� nextLine()�� ������ �ش�. ������ ����.
		int i=0;
		while(true) {
			System.out.print("[" + p[i].getName() + "]:<Enter>");
			String enter = scanner.nextLine();
			if(enter.equals("")) {
				int a = (int)(Math.random()*3 + 1);
				int b = (int)(Math.random()*3 + 1);
				int c = (int)(Math.random()*3 + 1);
				System.out.print("	"+ a + "   " + b + "   " + c + "   ");
				if(a==b & b==c) {
					System.out.println(p[i].getName() + "���� �̰���ϴ�!");
					break;
				}
				else
					System.out.println("�ƽ�����!");
			}
			
			i = (i+1)%num;
		}
		
		scanner.close();
	}

}
