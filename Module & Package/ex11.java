package practice6;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		StringBuffer sb = new StringBuffer(scanner.nextLine());
		while(true) {
			System.out.print("명령: ");
			String s = scanner.next();
			if(s.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			String [] sp = s.split("!");
			if(sp.length!=2) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			else {
				if(sp[0].length()==0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				int index = sb.indexOf(sp[0]);
				if(index==-1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				sb.replace(index, index+sp[0].length(), sp[1]);
				System.out.println(sb);
			}
		}
		scanner.close();
	}

}
