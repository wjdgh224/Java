package practice4;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = {"love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];	
			}
		}
		return "";
	}
}

public class ex10 {
	Scanner scanner = new Scanner(System.in);
	void run() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = scanner.next();
			if(word.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(word);
			if(eng.equals(""))
				System.out.println(word + "��/�� ���� ������ �����ϴ�.");
			else
				System.out.println(word + "��/�� " + eng);
			
		}
	}
	public static void main(String[] args) {
		ex10 d = new ex10();
		d.run();

	}

}
