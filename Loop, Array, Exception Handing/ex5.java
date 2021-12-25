package practice3;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int a[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%3==0)
				System.out.print(a[i] + " ");
		}
		
		scanner.close();
	}

}
