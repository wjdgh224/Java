package practice6;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			/*StringTokenizer st = new StringTokenizer(s, " ");
			int cnt=0;
			while(st.hasMoreTokens()) {
				st.nextToken();
				cnt++;
			}
			System.out.println("���� ������ " + cnt);*/
			String [] sp = s.split(" ");
			System.out.println("���� ������ " + sp.length);		}
		
		scanner.close();

	}

}
