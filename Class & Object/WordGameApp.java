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
			System.out.println(this.name + "이 졌습니다.");
			return 1;
		}
		return 0;
	}
}

public class WordGameApp {
	
	static void play() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scanner.nextInt();
		Player [] p = new Player[n];
		for(int i=0; i<n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			p[i] = new Player(name);
		}
		
		char temp = '지';
		int i=0;
		System.out.println("시작하는 단어는 아버지입니다.");
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
		System.out.println("끝말잇기 게임을 시작합니다...");
		WordGameApp.play();

	}

}
