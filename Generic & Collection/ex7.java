package practice7;
import java.util.*;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String, Double>();
		String [] sp;
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String s = scanner.nextLine();
			sp = s.split(" ");
			hm.put(sp[0], Double.parseDouble(sp[1]));
			
		}
		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double score = scanner.nextDouble();
		System.out.print("장학생 명단 : ");
		for(int i=0; i<5; i++) {
			String key = it.next();
			double val = hm.get(key);
			if(val >= score)
				System.out.print(key + " ");
		}
		
		scanner.close();
	}

}
