package practice3;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = (int)(Math.random()*100+1);
		}
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
			if((i+1)%10==0)
				System.out.println();
		}

		scanner.close();
	}

}
