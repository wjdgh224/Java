package practice3;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int a[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.print("3�� ����� ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%3==0)
				System.out.print(a[i] + " ");
		}
		
		scanner.close();
	}

}
