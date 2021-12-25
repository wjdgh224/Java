package practice3;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-i; j>0; j--)
				System.out.print("*");
			System.out.println();
		}
	
		scanner.close();
	}

}
