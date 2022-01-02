package practice7;
import java.util.*;

class Nation {
	private String country, capital;
	Nation(String country, String capital) {
		this.country = country; this.capital = capital;
	}
	String getCtry() {
		return country;
	}
	String getCap() {
		return capital;
	}
}

public class ex11_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Nation> v = new Vector<Nation>();
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.println("현재" + v.size() + "개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력" + (v.size()+1) + ">> ");
					String country = scanner.next();
					if(country.equals("그만"))
						break;
					String capital = scanner.next();
					int chk=0;
					for(int i=0; i<v.size(); i++) {//리스트 중복 체크
						String s = v.get(i).getCtry();
						if(country.equals(s)) {
							System.out.println(s + "는 이미 있습니다!");
							chk=1;
						}		
					}
					if(chk==0)
						v.add(new Nation(country, capital));
					
				}
			}
			else if(sel==2) {
				while(true) {
					int index = (int)(Math.random()*v.size());
					Nation n = v.get(index);
					System.out.print(n.getCtry() + "의 수도는? ");
					String answer = scanner.next();
					if(answer.equals("그만"))
						break;
					if(answer.equals(n.getCap()))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
				}
			}
			else {
					System.out.println("게임을 종료합니다.");
					break;
				}
		}
		
		scanner.close();
	}

}
