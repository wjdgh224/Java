package practice;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		int first = num/10;
		int second = num%10;
		if(((first==3)||(first==6)||(first==9))&&((second==3)||(second==6)||(second==9)))
			System.out.println("�ڼ�¦¦");
		else if(((first==3)||(first==6)||(first==9))||((second==3)||(second==6)||(second==9)))
			System.out.println("�ڼ�¦");
		
		scanner.close();
	}

}
