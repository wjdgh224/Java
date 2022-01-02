package practice7;
import java.util.*;

class Word {
	private String eng, kor;
	Word(String eng, String kor) {
		this.eng = eng; this.kor =kor;
	}
	public String getEng() {
		return eng;
	}
	public String getKor() {
		return kor;
	}
}

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("painting", "그림"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("error", "오류"));
		v.add(new Word("society", "사회"));
		v.add(new Word("doll", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("view", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("transaction", "거래"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("human", "인간"));
		v.add(new Word("statue", "조각상"));
		
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		while(true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");
				int chk[] = new int[v.size()];//단어 중복 체크
				String list[] = new String[4];//목록 중복 체크
				
				while(true) {
					for(int i=0; i<v.size(); i++)
						chk[i]=0;
					for(int i=0; i<4; i++)
						list[i] = "";
					int index = (int)(Math.random()*v.size());
					int pos = (int)(Math.random()*4);//삽입 위치
					Word w = v.get(index);
					String answer = w.getKor();//정답
					chk[index] = 1; list[pos] = w.getKor();
					System.out.println(w.getEng() + "?");
					
					int cnt=0;
					while(true) {//나머지 3개 단어 선택
						index = (int)(Math.random()*v.size());
						if(chk[index]!=1) {//다른 단어 선택
							chk[index] = 1;
							w = v.get(index);
							for(int i=0; i<4; i++) {//목록 배열 중 빈 칸에 삽입
								if(list[i].equals("")) {
									list[i] = w.getKor();
									cnt++;
									break;
								}
							}
						}
						if(cnt==3)
							break;
					}
					for(int i=0; i<4; i++)
						System.out.print("(" + (i+1) + ")" + list[i] + " ");
					System.out.print(":>");
					int num=0;
					try {
						num = scanner.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("숫자를 입력하세요 !!");
						scanner.nextLine();
						continue;
					}
					if(num==-1) {
						System.out.println();
						break;
					}
					if(answer.equals(list[num-1]))
						System.out.println("Excellent !!");
					else
						System.out.println("NO. !!");
					
				}
			}
			else if(sel==2) {
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				while(true) {
					System.out.print("영어 한글 입력 >> ");
					String eng = scanner.next();
					if(eng.equals("그만")) {
						System.out.println();break;
					}
					String kor = scanner.next();
					v.add(new Word(eng, kor));
				}
 			}
			else {
				System.out.println("\"명품영어\"를 종료합니다.");
				break;
			}
		}
		scanner.close();
	}

}
