package practice7;
import java.util.*;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int point = scanner.nextInt();
			
			if(hm.get(name)!=null) {
				hm.put(name, hm.get(name) + point);
			}
			else {
				hm.put(name, point);
			}
			
			Set<String> s = hm.keySet();
			Iterator<String> it = s.iterator();
			while(it.hasNext()) {
				String n = it.next();
				System.out.print("(" + n + "," + hm.get(n) + ")");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
