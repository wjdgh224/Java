package practice7;
import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			int population = scanner.nextInt();
			hm.put(country, population);
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			if(hm.get(country)==null)
				System.out.println(country + " ����� �����ϴ�.");
			else
				System.out.println(country + "�� �α��� " + hm.get(country));

		}
		
		scanner.close();
	}

}
