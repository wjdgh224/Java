package practice3;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str [] = {"가위", "바위", "보" };
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String usr = scanner.next();
			String com = str[(int)(Math.random()*3)];
			if(usr.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			System.out.print("사용자 = " + usr + " , 컴퓨터 = " + com + ", ");
			if(usr.equals(com))
				System.out.println("비겼습니다.");
			else if(usr.equals("가위")) {
				if(com.equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			}
			else if(usr.equals("바위")) {
				if(com.equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			}
			else
				if(com.equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
		}
		
		scanner.close();
	}
}

