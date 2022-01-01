package practice7;
import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			int population = scanner.nextInt();
			hm.put(country, population);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			if(hm.get(country)==null)
				System.out.println(country + " 나라는 없습니다.");
			else
				System.out.println(country + "의 인구는 " + hm.get(country));

		}
		
		scanner.close();
	}

}
