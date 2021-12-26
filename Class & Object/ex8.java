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
		System.out.print("인원수>>");
		num = scanner.nextInt();
		p = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	void search() {
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int chk = 0;
			for(int i=0; i<num; i++) {
				if(name.equals(p[i].getName())) {
					System.out.println(name + "의 번호는 " + p[i].getNum() + " 입니다.");
					chk = 1;
				}		
			}
			if(chk==0)
				System.out.println(name + "이/가 없습니다.");
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
