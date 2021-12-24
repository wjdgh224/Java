package practice;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		int first = num/10;
		int second = num%10;
		if(((first==3)||(first==6)||(first==9))&&((second==3)||(second==6)||(second==9)))
			System.out.println("박수짝짝");
		else if(((first==3)||(first==6)||(first==9))||((second==3)||(second==6)||(second==9)))
			System.out.println("박수짝");
		
		scanner.close();
	}

}
