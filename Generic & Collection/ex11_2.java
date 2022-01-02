package practice7;
import java.util.*;

public class ex11_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.println("현재 " + hm.size() + "개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력" + (hm.size()+1) + ">> ");
					String country = scanner.next();
					if(country.equals("그만"))
						break;
					String capital = scanner.next();
					if(hm.get(country)==null)
						hm.put(country, capital);
					else
						System.out.println(country + "는 이미 있습니다!");
				}
			}
			else if(sel==2) {
				while(true) {
					Set<String> s = hm.keySet();
					Object array [] = s.toArray();
					int index = (int)(Math.random()*hm.size());
					String country = (String)array[index];
					String capital = hm.get(country);
					System.out.print(country + "의 수도는? ");
					String answer = scanner.next();
					if(answer.equals("그만"))
						break;
					if(capital.equals(answer))
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
