package practice6;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		StringBuffer sb = new StringBuffer(scanner.nextLine());
		while(true) {
			System.out.print("���: ");
			String s = scanner.next();
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			String [] sp = s.split("!");
			if(sp.length!=2) {
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			}
			else {
				if(sp[0].length()==0) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}
				int index = sb.indexOf(sp[0]);
				if(index==-1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				sb.replace(index, index+sp[0].length(), sp[1]);
				System.out.println(sb);
			}
		}
		scanner.close();
	}

}
