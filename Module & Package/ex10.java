package practice6;
import java.util.Scanner;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person p[] = new Person[2];
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			String name = scanner.next();
			p[i] = new Person(name);			
		}
		scanner.nextLine();//이름 입력시 사용된 enter가 버퍼에 존재해서 enter를 리턴할 수 있는 nextLine()에 영향을 준다. 사전에 제거.
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
					System.out.println(p[i].getName() + "님이 이겼습니다!");
					break;
				}
				else
					System.out.println("아쉽군요!");
			}
			
			i = (i+1)%2;
		}
		
		scanner.close();
	}

}
