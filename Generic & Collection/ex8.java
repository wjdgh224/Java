package practice7;
import java.util.*;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
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
