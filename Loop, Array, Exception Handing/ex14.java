package practice3;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("�����̸�>>");
			String sub = scanner.next();
			if(sub.equals("�׸�"))
				break;
			int index = -1;
			for(int i=0; i<course.length; i++) {
				if(sub.equals(course[i]))
					index = i;
			}
			if(index == -1)
				System.out.println("���� �����Դϴ�.");
			else
				System.out.println(sub + "�� ������ " + score[index]);
		}
		
		scanner.close();

	}

}
