package practice3;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-i; j>0; j--)
				System.out.print("*");
			System.out.println();
		}
	
		scanner.close();
	}

}
