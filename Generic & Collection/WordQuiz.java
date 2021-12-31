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

public class WordQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("painting", "�׸�"));
		v.add(new Word("emotion", "����"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("error", "����"));
		v.add(new Word("society", "��ȸ"));
		v.add(new Word("doll", "����"));
		v.add(new Word("bear", "��"));
		v.add(new Word("view", "����"));
		v.add(new Word("eye", "��"));
		v.add(new Word("transaction", "�ŷ�"));
		v.add(new Word("picture", "����"));
		v.add(new Word("human", "�ΰ�"));
		v.add(new Word("statue", "������"));
		
		System.out.println("\"��ǰ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + v.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		int chk[] = new int[v.size()];//�ܾ� �ߺ� üũ
		String list[] = new String[4];//��� �ߺ� üũ
		
		while(true) {
			for(int i=0; i<v.size(); i++)
				chk[i]=0;
			for(int i=0; i<4; i++)
				list[i] = "";
			int index = (int)(Math.random()*v.size());
			int pos = (int)(Math.random()*4);//���� ��ġ
			Word w = v.get(index);
			String answer = w.getKor();//����
			chk[index] = 1; list[pos] = w.getKor();
			System.out.println(w.getEng() + "?");
			
			int cnt=0;
			while(true) {//������ 3�� �ܾ� ����
				index = (int)(Math.random()*v.size());
				if(chk[index]!=1) {//�ٸ� �ܾ� ����
					chk[index] = 1;
					w = v.get(index);
					for(int i=0; i<4; i++) {//��� �迭 �� �� ĭ�� ����
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
			int num = scanner.nextInt();
			if(num==-1) {
				System.out.println("\"��ǰ����\"�� �����մϴ�...");
				break;
			}
			if(answer.equals(list[num-1]))
				System.out.println("Excellent !!");
			else
				System.out.println("NO. !!");
			
		}
		

	}

}
