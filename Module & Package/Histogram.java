package practice6;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class Histogram {//String + String 또는 StringBuffer의 append사용
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		String arr [] = new String[100];
		int alpha[] = new int[26];
		int cnt=0;
		while(true) {
			String s = scanner.nextLine();
			if(s.equals(";"))
				break;
			arr[cnt] = s;
			cnt++;
		}
		
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				int num = arr[i].charAt(j);
				if(num>=65 && num<=90) {
					alpha[num-65]++;
				}
				else if(num>=97 && num<=122) {
					alpha[num-97]++;
				}
				
			}
		}
		for(int i=0; i<26; i++) {
			System.out.print((char)(i+65));
			for(int j=0; j<alpha[i]; j++) {
				System.out.print('-');
			}
			System.out.println();
		}
	}

}

/*
It's now or never, come hold me tight
Kiss me my darling, be mine tonight
Tomorrow will be too late
It's now or never, my love won't wait
When I first saw you, with your smile so tender
My heart was captured, my soul surrendered
I spent a lifetime, waiting for the right time
Now that your near, the time is here, at last
It's now or never, come hold me tight
Kiss me my darling, be mine tonight
Tomorrow will be too late
It's now or never, my love won't wait.
 * */
