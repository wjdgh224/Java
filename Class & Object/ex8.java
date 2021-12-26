package practice4;
import java.util.Scanner;

class Phone {
	private String name, tel;
	Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	String getName() {
		return this.name;
	}
	String getNum() {
		return this.tel;
	}
}

public class ex8 {
	Scanner scanner = new Scanner(System.in);
	Phone [] p;
	int num;
	void save() {
		System.out.print("�ο���>>");
		num = scanner.nextInt();
		p = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	void search() {
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			int chk = 0;
			for(int i=0; i<num; i++) {
				if(name.equals(p[i].getName())) {
					System.out.println(name + "�� ��ȣ�� " + p[i].getNum() + " �Դϴ�.");
					chk = 1;
				}		
			}
			if(chk==0)
				System.out.println(name + "��/�� �����ϴ�.");
		}
	}
	
	void run() {
		save();
		search();
	}
	
	public static void main(String[] args) {
		ex8 p = new ex8();
		p.run();

	}

}
