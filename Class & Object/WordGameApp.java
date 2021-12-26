package practice4;
import java.util.Scanner;

class Player {
	Scanner scanner  = new Scanner(System.in);
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	String getWordFromUser() {
		System.out.print(this.name + ">>");
		String word = scanner.next();
		return word;
	}
	
	int checkSuccess(char first, char last) {
		if(first != last) {
			System.out.println(this.name + "�� �����ϴ�.");
			return 1;
		}
		return 0;
	}
}

public class WordGameApp {
	
	static void play() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int n = scanner.nextInt();
		Player [] p = new Player[n];
		for(int i=0; i<n; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scanner.next();
			p[i] = new Player(name);
		}
		
		char temp = '��';
		int i=0;
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		while(true) {
			String word = p[i].getWordFromUser();
			if(p[i].checkSuccess(word.charAt(0), temp)==0) {
				i = (i+1)%n;
				temp = word.charAt(word.length()-1);
			}
			else {
				break;
			}
		}
		scanner.close();
	}
	public static void main(String[] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");
		WordGameApp.play();

	}

}
