package practice7;
import java.util.*;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String, Double>();
		String [] sp;
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			String s = scanner.nextLine();
			sp = s.split(" ");
			hm.put(sp[0], Double.parseDouble(sp[1]));
			
		}
		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double score = scanner.nextDouble();
		System.out.print("���л� ��� : ");
		for(int i=0; i<5; i++) {
			String key = it.next();
			double val = hm.get(key);
			if(val >= score)
				System.out.print(key + " ");
		}
		
		scanner.close();
	}

}
