package practice6;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String []s = {"가위", "바위", "보" };
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int chul = scanner.nextInt();
			if(chul==4)
				break;
			int com = (int)(Math.random()*3+1);
			System.out.println("철수(" + s[chul-1] + ") : 컴퓨터(" + s[com-1] + ")");
			if(chul==com)
				System.out.println("비겼습니다.");
			else if(chul==1) {
				if(com==2)
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("철수가 이겼습니다.");
			}
			else if(chul==2) {
				if(com==3)
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("철수가 이겼습니다.");
			}
			else {
				if(com==1)
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("철수가 이겼습니다.");
			}
			
		}
		
		scanner.close();
	}

}
