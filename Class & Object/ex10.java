package practice4;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망" };
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
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String word = scanner.next();
			if(word.equals("그만"))
				break;
			String eng = Dictionary.kor2Eng(word);
			if(eng.equals(""))
				System.out.println(word + "은/는 저의 사전에 없습니다.");
			else
				System.out.println(word + "은/는 " + eng);
			
		}
	}
	public static void main(String[] args) {
		ex10 d = new ex10();
		d.run();

	}

}
