package practice3;
import java.util.Scanner;
import java.util.Random;

public class UpDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			System.out.println("0-99");
			
			int i = 1, min = 0, max = 99;
			while(true) {
				System.out.print(i + ">>");
				int num = scanner.nextInt();
				if(k<num) {
					max = num-1;
					System.out.println("�� ����");
					System.out.println(min + "-" + max);
				}
				else if(k>num){
					min = num+1;
					System.out.println("�� ����");
					System.out.println(min + "-" + max);
				}
				else {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				i++;
			}
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			String s = scanner.next();
			if(s.equals("n"))
				break;
		}
		
		scanner.close();
	}

}
